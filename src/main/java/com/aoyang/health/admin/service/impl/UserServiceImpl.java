package com.aoyang.health.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aoyang.health.admin.dao.UserDao;
import com.aoyang.health.admin.entity.User;
import com.aoyang.health.admin.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;
	
	@Override
	public void save(User e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		return dao.findAll();
	}

}
