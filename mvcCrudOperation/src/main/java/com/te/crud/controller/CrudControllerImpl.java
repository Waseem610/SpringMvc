package com.te.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.crud.crudservice.Service;
import com.te.crud.model.Employee;

@Controller("/")
public class CrudControllerImpl implements CrudController {
	@Autowired
	Service service;
	@Override
	@GetMapping("/add")
	public String add() {
		
		return "add";
	}

	@Override
	@PostMapping("/add")
	public String create(Employee emp) {
		if(service.add(emp)) {
		return "success";
		}else {
		return "failure";
		}
	}

	@Override
	@GetMapping("/retrive")
	public String retrive() {
		
		return "retrive";
	}
	@PostMapping("/retrive")
	public String getData(@RequestParam(name="empId") int id,ModelMap map) {
		if(id!=0) {
			Employee retrive = service.retrive(id);
			if(retrive!=null) {
			map.addAttribute("Employee", retrive);
			return "data";
			}
			else
				return "id";			
		}
		return "id";
	}
	@Override
	@GetMapping("/update")
	public String update() {
	
		return "update";
	}
	@PostMapping("/update")
	public String updateData(Employee emp) {
		if(service.update(emp)) 
			return "success";
		else
			return "failure";
	}
	@Override
	@GetMapping("/delete")
	public String delete() {
		
		return "delete";
	}
	@PostMapping("/delete")
	public String deleteData(int id) {
		if(service.delete(id)) 
			return "success";
		else
			return "failure";
	}

	
	@GetMapping("/details")
	public String getAll(ModelMap map) {
		// TODO Auto-generated method stub
		List<Employee> all = service.getAll();
		if(all!=null) {
		map.addAttribute("all", all);
		return "allDetails";
		}else
			return "failure";
		
	}
	

}
