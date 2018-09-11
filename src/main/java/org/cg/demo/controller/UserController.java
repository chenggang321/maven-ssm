package org.cg.demo.controller;

import org.cg.demo.bean.EasyUIPage;
import org.cg.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="user")
public class UserController {
	
	@Autowired
	private UserService userService;
	/**
	 * 定义跳转到users.jsp
	 */
	@RequestMapping(value="users")
	public String toUsers() {
		return "users";
	}
	
	@RequestMapping(value="list")
	@ResponseBody
	public EasyUIPage queryAllUser(){
		EasyUIPage page = userService.queryPage();
		System.out.println(page);
		return page;
	}
}
