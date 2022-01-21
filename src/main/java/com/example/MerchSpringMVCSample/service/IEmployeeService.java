package com.example.MerchSpringMVCSample.service;

import java.util.List;

import com.example.MerchSpringMVCSample.model.Employee;

public interface IEmployeeService {
	
	void addEmployee(Employee employee);
	
	List<Employee> getAllEmployee();

	Employee getEmployeeById(int empId);
	
	void updateEmployee(Employee employee, int empId);
	
	void deleteEmployee(int empId);
}
