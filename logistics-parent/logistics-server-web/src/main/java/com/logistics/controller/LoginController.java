package com.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	/**
	 * 登录
	 * @return
	 */
	@RequestMapping("loginAction_login")
	public String login() {
		return "/home/fmain";
	}
	
}
