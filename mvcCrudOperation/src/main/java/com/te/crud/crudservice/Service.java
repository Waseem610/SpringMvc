package com.te.crud.crudservice;

import java.util.List;

import com.te.crud.model.Employee;

public interface Service {
	boolean add(Employee emp);

	Employee retrive(int id);

	boolean update(Employee emp);

	boolean delete(int id);
	public List getAll();
}
