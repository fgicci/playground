package com.gicci.playground.service;

import java.util.List;

public interface CrudService<T> {

	public T create(T object);
	public T update(T object) throws RuntimeException;
	public T delete(Long id) throws RuntimeException;
	public T findById(Long id) throws RuntimeException;
	public List<T> findAll();
	
}
