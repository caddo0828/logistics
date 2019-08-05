package com.logistics.realm;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.logistics.pojo.Module;
import com.logistics.pojo.User;
import com.logistics.service.UserService;

public class UserRealm extends AuthorizingRealm{
	@Autowired
	private UserService userService;
	
	//返回当前自定义Realm的名称
	@Override
	public String getName() {
		return "userRealm";
	}
	
	/**
	 * 用户授权信息
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
		System.out.println("======用户授权======");
		/**
		 * 授权： 根据用户id查询用户角色表，获取角色表中的集合信息
		 *     遍历，获取每一个角色id，在角色-模块表中查询对应模块的集合
		 *     遍历模块集合，获取每一个模块对象，获取每个模块对象的cperssion属性，添加到授权对象中
		 */
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		User user = (User) principal.fromRealm(getName()).iterator().next();
		Set<Module> set = userService.findModuleById(user.getUserId());
		if(set!=null&&set.size()>0) {
			for (Module module : set) {
				info.addStringPermission(module.getCpermission());
			}
		}
		return info;
	}

	/**
	 * 用户身份验证，如果验证失败，则返回null
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		System.out.println("======用户认证======");
		String userName = (String) token.getPrincipal();
		//根据用户名查询是否存在对应的用户
		User user = userService.findByName(userName);
		if(user==null) {
			//不存在对应用户，登录失败
			return null;
		}
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,user.getPassword(),ByteSource.Util.bytes(user.getUserName()),getName());;
		if(info!=null) {
			//表明用户名和密码都正确
			SecurityUtils.getSubject().getSession().setAttribute("_CURRENT_USER", userService.findModuleById(user.getUserId()));
		}
		return info;
	}

}
