package com.te.crud.crudservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.te.crud.dao.daoLayer;
import com.te.crud.model.Employee;

@org.springframework.stereotype.Service
public class ServiveImpl implements Service {
	@Autowired
	daoLayer daoLayer;

	@Override
	public boolean add(Employee emp) {
		boolean res = false;
		if (emp != null) {
			boolean add = daoLayer.add(emp);
			if (add) {
				res = true;
			} else {
				res = false;
			}
		}
		return res;
	}

	@Override
	public Employee retrive(int id) {
			Employee retriver = daoLayer.retrive(id);
			return retriver;
	}

	@Override
	public boolean update(Employee emp) {
		if(emp!=null) {
			if(daoLayer.update(emp))
				return true;
			else
				return false;
		}else
		return false;
	}

	@Override
	public boolean delete(int id) {
		if(id!=0) {
			if(daoLayer.delete(id))
				return true;
			else
				return false;
		}
			return false;
	}
	public List<Employee> getAll() {
		List<Employee> all = daoLayer.getAll();
		return all;
		
	}

}
