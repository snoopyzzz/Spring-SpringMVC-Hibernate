package com.blog.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.service.UserService;



@Controller
public class UserController {
	@Resource	
	private UserService userService;
	
	@RequestMapping(value = "/test")
	public String Login() {
		return "admin/test";
	}
}
