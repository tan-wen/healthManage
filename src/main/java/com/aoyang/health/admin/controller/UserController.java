package com.aoyang.health.admin.controller;

import java.util.UUID;

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
public class UserController extends BaseController {

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
	
	@RequestMapping("add")
	public String add() {
		return "user/add";
	}
	
	@RequestMapping("save")
	public String save(User user) {
		user.setId(UUID.randomUUID().toString());
		System.out.println(user);
		userService.save(user);
		return "redirect:/admin/user/index";
	}
}
