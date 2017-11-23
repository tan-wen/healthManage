package com.aoyang.health.admin.service;

import com.aoyang.health.admin.entity.User;

public interface UserService extends BaseService<User> {

	User findByName(String name);
}
