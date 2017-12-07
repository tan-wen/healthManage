package com.aoyang.health.admin.dao;

import java.util.List;

import com.aoyang.health.admin.entity.User;

public interface UserDao extends BaseDao<User>{

	List<User> findByName(String name);
}
