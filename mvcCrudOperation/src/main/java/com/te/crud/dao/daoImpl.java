package com.te.crud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.te.crud.model.Employee;

@Repository
public class daoImpl implements daoLayer {
	private EntityManager getEntityManager() {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("crud");
		return createEntityManagerFactory.createEntityManager();

	}

	@Override
	public boolean add(Employee emp) {
		try {
			EntityManager entityManager = getEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(emp);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public Employee retrive(int id) {

		EntityManager entityManager = getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Employee find = entityManager.find(Employee.class, id);
		transaction.commit();
		return find;

	}

	@Override
	public boolean update(Employee emp) {
		boolean res = false;
		try {
			EntityManager entityManager = getEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			Employee find = entityManager.find(Employee.class, emp.getEmpId());

			transaction.begin();
			String empty = "";
			if (emp.getDoj() != empty) {
				find.setDoj(emp.getDoj());
			}
			if (emp.getEmail() != empty) {
				find.setEmail(emp.getEmail());
			}
			if (emp.getFirstName() != empty) {
				find.setFirstName(emp.getFirstName());
			}
			if (emp.getLastName() != empty) {
				find.setLastName(emp.getLastName());
			}
			double salary = 0.0;
			if (emp.getSalary() != salary) {
				find.setSalary(emp.getSalary());
			}
			transaction.commit();
			res = true;

		} catch (

		Exception e) {
			e.printStackTrace();
			res = false;
		}
		return res;
	}

	@Override
	public boolean delete(int id) {
		try {
			EntityManager entityManager = getEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			Employee find = entityManager.find(Employee.class, id);
			entityManager.remove(find);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List getAll() {
		EntityManager entityManager = getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query createQuery = entityManager.createQuery("from Employee");
		List resultList = createQuery.getResultList();
		return resultList;
	}

}