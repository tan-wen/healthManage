package com.aoyang.health.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aoyang.health.admin.entity.User;
import com.aoyang.health.admin.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/admin/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("index")
	public String index() {
		return "user/index";
	}
	
	@RequestMapping("list")
	@ResponseBody
	public PageInfo<User> list(
			@RequestParam(required=true,defaultValue="1") Integer page,
            @RequestParam(required=false,defaultValue="10") Integer rows) {
		
		PageHelper.startPage(page, rows);
		return new PageInfo<User>(userService.findAll());
	}
}
