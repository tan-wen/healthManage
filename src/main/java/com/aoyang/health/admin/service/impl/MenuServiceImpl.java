package com.aoyang.health.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aoyang.health.admin.dao.MenuDao;
import com.aoyang.health.admin.entity.Menu;
import com.aoyang.health.admin.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDao dao;
	
	@Override
	public void save(Menu e) {
		dao.save(e);
	}

	@Override
	public void update(Menu e) {
		dao.update(e);
	}

	@Override
	public Menu findById(String id) {
		return dao.findById(id);
	}

	@Override
	public List<Menu> findAll() {
		return dao.findAll();
	}

}
