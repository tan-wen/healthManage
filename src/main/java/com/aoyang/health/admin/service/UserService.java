package com.aoyang.health.admin.service;

import java.util.List;

import com.aoyang.health.admin.entity.User;

public interface UserService extends BaseService<User> {

	List<User> findByName(String name);
}
