package com.logistics.controller;

import org.apache.shiro.subject.Subject;
import javax.servlet.http.HttpServletRequest;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	/**
	 * 登录
	 * @return
	 */
	@RequestMapping("loginAction_login")
	public String login(String username , String password,HttpServletRequest request) {
		//根据用户名，计密码进行用户校验
		UsernamePasswordToken token = new UsernamePasswordToken(username,password);
		Subject subject = SecurityUtils.getSubject();
		try {
			subject.login(token);
			return "/home/fmain";
		} catch (AuthenticationException e) {
			//认证失败时，跳回等录页面
			request.setAttribute("errorInfo", "用户名或密码错误");
			e.printStackTrace();
			return "/sysadmin/login/login";
		}
		
	}
	
	/**
	 * 用户退出
	 * @return
	 */
	@RequestMapping("loginAction_logout")
	public String logout() {
		Subject subject = SecurityUtils.getSubject();
		subject.getSession().removeAttribute("_CURRENT_USER");
		subject.logout();
		return "/sysadmin/login/login";
	}
	
}
