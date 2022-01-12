package com.te.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Employee  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String firstName;
	private String lastName;
	private String email;
	private String doj;
	private double salary;
}
