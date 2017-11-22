package com.aoyang.health.admin;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.aoyang.health.admin.entity.Menu;
import com.aoyang.health.admin.service.MenuService;
import com.google.gson.Gson;

public class MenuTest extends BaseJunit4Test{

	@Autowired
	private MenuService menuService;
	
	@Test
	public void testFindAll() {
		List<Menu> menuList = menuService.findAll();
		System.out.println(new Gson().toJson(menuList));
	}
}
