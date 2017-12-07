package com.aoyang.health.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aoyang.health.admin.entity.User;
import com.aoyang.health.admin.service.UserService;


@Controller
@RequestMapping("/admin")
public class LoginController extends BaseController {

	@Value("#{propertiesFactory['sys.name']}")
	private String sysName;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("")
	public ModelAndView index(ModelAndView model) {
		model.addObject("sysName", sysName);
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("login")
	public String login(String name, String password, ModelMap modelMap, HttpServletRequest request) {
		if (StringUtils.isEmpty(name)) {
			modelMap.put("errMsg", "用户名不能为空");
			return "forward:/admin";
		}
		if (StringUtils.isEmpty(password)) {
			modelMap.put("errMsg", "密码不能为空");
			return "forward:/admin";
		}
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		List<User> userList = userService.findByName(name);
		if (userList.size() < 1) {
			modelMap.put("errMsg", "用户名和密码不匹配");
			modelMap.put("user", user);
			return "forward:/admin";
		} else {
			User userDb = userList.get(0);
			//TODO 用户密码加密
			if (password.equals(userDb.getPassword())) {
				HttpSession session = request.getSession();
				session.setAttribute("user", userDb);
				//TODO 更新登录信息
				return "redirect:/admin/homePage";
			}
		}
		return "redirect:/admin";
	}
	
	@RequestMapping("homePage")
	public String homePage() {
		
		return "admin/home";
	}
	
	@RequestMapping("logout")
	public String logout(HttpServletRequest request){
		HttpSession session = request.getSession();
		if (session != null) {
			session.invalidate();
		}
		return "redirect:/admin/";
	}
}
