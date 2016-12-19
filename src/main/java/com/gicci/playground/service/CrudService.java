package com.gicci.playground.service;

import java.util.List;

public interface CrudService<T> {

	public T create(T type);
	public T update(T type);
	public T delete(Integer id);
	public T findById(Integer id);
	public List<T> findAll();
	
}
