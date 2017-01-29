package com.gicci.playground.service;

import java.util.List;

import com.gicci.playground.exception.RecordConstraint;
import com.gicci.playground.exception.RecordNotFound;

public interface CrudService<T> {

	public T create(T type) throws RecordConstraint;
	public T update(T type) throws RecordNotFound;
	public T delete(Long id) throws RecordNotFound;
	public T findById(Long id) throws RecordNotFound;
	public List<T> findAll();
	
}
