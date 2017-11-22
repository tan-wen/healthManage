package com.aoyang.health.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aoyang.health.admin.service.MenuService;

@Controller
@RequestMapping("/admin/menu")
public class MenuController {

	@Autowired
	private MenuService menuService;
	
	
}
