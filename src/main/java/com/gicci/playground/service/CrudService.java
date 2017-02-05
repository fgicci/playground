package com.gicci.playground.service;

import java.util.List;

import com.gicci.playground.exception.RecordNotFound;

public interface CrudService<T> {

	public T create(T object);
	public T update(T object) throws RecordNotFound;
	public T delete(Long id) throws RecordNotFound;
	public T findById(Long id) throws RecordNotFound;
	public List<T> findAll();
	
}
