package com.aoyang.health.admin.dao;

import com.aoyang.health.admin.entity.User;

public interface UserDao extends BaseDao<User>{

	User findByName(String name);
}
