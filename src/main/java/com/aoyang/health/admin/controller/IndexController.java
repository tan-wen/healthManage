package com.aoyang.health.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class IndexController {

	@RequestMapping("/index")
	public ModelAndView index(ModelAndView model) {
		
		model.setViewName("index");
		return model;
	}
}
