package com.logistics.controller.sysadmin;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.logistics.pojo.Dept;
import com.logistics.pojo.User;
import com.logistics.pojo.UserChild;
import com.logistics.pojo.UserInfo;
import com.logistics.service.DeptService;
import com.logistics.service.UserService;
import com.logistics.utils.PageUtil;

@Controller
@RequestMapping("/sysadmin/")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private DeptService deptService;
	
	/**
	 * 显示用户列表
	 * @param pageNo
	 * @param request
	 * @return
	 */
	@RequestMapping("userAction_list")
	public String getList(@RequestParam(value="pageNo",defaultValue="1") int pageNo,HttpServletRequest request) {
		PageUtil<Object> util = userService.findAll(pageNo);
		request.setAttribute("pageUtils", util);
		return "sysadmin/user/jUserList";
	}
	
	/**
	 * 查看单个用户信息
	 * @param userId
	 * @param request
	 * @return
	 */
	@RequestMapping("userAction_toview")
	public String toView(String userId,HttpServletRequest request) {
		User user = userService.findOne(userId);
		Dept dept = deptService.findById(user.getDeptId());
		request.setAttribute("user", user);
		request.setAttribute("dept", dept);
		return "sysadmin/user/jUserView";
	}
	
	/**
	 * 显示用户修改页面
	 * @param userId
	 * @return
	 */
	@RequestMapping("userAction_toupdate")
	public String toUpdate(String userId ,HttpServletRequest request) {
		UserChild child = userService.selById(userId);
		List<Dept> list = deptService.findAll();
		Dept dept = deptService.findById(child.getDeptId());
		request.setAttribute("d", dept);
		request.setAttribute("list", list);
		request.setAttribute("user", child);
		return "sysadmin/user/jUserUpdate";
	}
	
	/**
	 * 修改用户信息（user表、userInfo表）
	 * @param user
	 * @param info
	 * @return
	 */
	@RequestMapping("userAction_update")
	public String update(User user , UserInfo info) {
		try {
			 userService.update(user, info);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/sysadmin/userAction_list";
	}	
	
	/**
	 * 显示用户新增页面
	 * @return
	 */
	@RequestMapping("userAction_tocreate")
	public String toCreate(HttpServletRequest request) {
		List<Dept> deptList = deptService.findAll();
		List<UserChild> userList = userService.findAll();
		
		request.setAttribute("deptList", deptList);
		request.setAttribute("userList", userList);
		return "sysadmin/user/jUserCreate";
	}
	
	/**
	 * 新增用户，用户详细信息
	 * @param user
	 * @param info
	 * @return
	 */
	@RequestMapping("userAction_insert")
	public String insert(User user , UserInfo info) {
		try {
			userService.insert(user, info);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/sysadmin/userAction_list";
	}
	
	
	/**
	 * 批量删除用户信息
	 * @param list
	 * @return
	 */
	@RequestMapping("userAction_delete")
	public String delete(@RequestParam("userId") List<String> list) {
		try {
			userService.delete(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/sysadmin/userAction_list";
	}
	
	
}
