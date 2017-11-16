package com.aoyang.health.admin.service;

import java.util.List;

public interface BaseService<E> {

	void save(E e);
	
	void update(E e);
	
	E findById(String id);
	
	List<E> findAll();
}
