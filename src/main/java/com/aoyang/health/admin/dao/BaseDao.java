package com.aoyang.health.admin.dao;

import java.util.List;

public interface BaseDao<E> {

	void save(E e);
	
	void update(E e);
	
	E findById(String id);
	
	List<E> findAll();
}
