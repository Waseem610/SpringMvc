package com.te.crud.dao;

import java.util.List;

import com.te.crud.model.Employee;

public interface daoLayer {
	boolean add(Employee emp);

	Employee retrive(int id);

	boolean update(Employee emp);

	boolean delete(int id);

	List getAll();
}
