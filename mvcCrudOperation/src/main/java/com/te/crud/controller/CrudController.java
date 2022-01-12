package com.te.crud.controller;

import org.springframework.ui.ModelMap;

import com.te.crud.model.Employee;

public interface CrudController {
	String add();
	String create(Employee emp);
	String retrive();
	String update();
	String delete();
	
}
