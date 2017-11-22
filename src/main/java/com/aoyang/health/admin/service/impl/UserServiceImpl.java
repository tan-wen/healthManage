package com.aoyang.health.admin.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSON;
import com.aoyang.health.admin.dao.UserDao;
import com.aoyang.health.admin.entity.User;
import com.aoyang.health.admin.service.UserService;
import com.google.gson.Gson;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;
	
	@Autowired
	private RedisTemplate<String, User> redisTemplate;
	
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
		List<User> users = new ArrayList<>();
		Set<String> sets = redisTemplate.keys("USER*");
		if (sets == null || sets.isEmpty()) {
			users = dao.findAll();
			if (!CollectionUtils.isEmpty(users)) {
				for (User user : users) {
					redisTemplate.opsForValue().set("USER"+user.getId(), user);
					System.out.println("redis存入用户信息：" + new Gson().toJson(user));
				}
			}
		} else {
			for (String userId : sets) {
				users.add(redisTemplate.opsForValue().get(userId));
				System.out.println("redis读取用户信息:" + userId);
			}
		}
		return users;
	}

}
