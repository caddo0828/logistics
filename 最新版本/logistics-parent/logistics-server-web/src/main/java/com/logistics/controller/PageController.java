package com.logistics.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面展示
 * @author 老腰
 *
 */
@Controller
public class PageController {
	/**
	 * 展示起始主框架页面, 匹配其他页面
	 * @param page
	 * @return
	 */
	@RequestMapping("{page}")
	public String fmain(@PathVariable("page") String page) {
		return "page";
	}
	
	/**
	 * 跳转登录页面
	 * @return
	 */
	@RequestMapping("/login")
	public String toLogin() {
		return "/sysadmin/login/login";
	}
	
	
	/**
	 * 显示title页面信息
	 * @return
	 */
	@RequestMapping("/homeAction_title")
	public String showTitle() {
		return "home/title";
	}
	
	/**
	 * 动态显示左部分页面信息
	 * @param moduleName
	 * @return
	 */
	@RequestMapping("homeAction_toleft.action")
	public String showLeft(String moduleName,HttpServletRequest request) {
		request.setAttribute("moduleName", moduleName);
		return moduleName+"/left";
	}
	
	/**
	 * 动态展示主页面信息
	 * @param moduleName
	 * @return
	 */
	@RequestMapping("homeAction_tomain.action")
	public String showMain(String moduleName) {
		return moduleName+"/main";
	}

}
