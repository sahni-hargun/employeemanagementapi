package com.hargunsinghsahni.springboot.employeemanagementapi.service;

import java.util.List;

import com.hargunsinghsahni.springboot.employeemanagementapi.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
