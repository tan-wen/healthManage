package com.aoyang.health.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class IndexController {

	@Value("#{propertiesFactory['sys.name']}")
	private String sysName;
	
	@RequestMapping("")
	public ModelAndView index(ModelAndView model) {
		
		model.addObject("sysName", sysName);
		model.setViewName("index");
		return model;
	}
}
