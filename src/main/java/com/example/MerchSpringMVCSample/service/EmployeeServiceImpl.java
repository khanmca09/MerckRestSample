package com.example.MerchSpringMVCSample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MerchSpringMVCSample.dao.IEmployeeDAO;
import com.example.MerchSpringMVCSample.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDAO daoRef;

	@Override
	public void addEmployee(Employee employee) {
		daoRef.save(employee);
		
	}

	@Override 
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return daoRef.findAll();
	}

	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return daoRef.getOne(empId);
	}

	@Override
	public void updateEmployee(Employee employee, int empId) {
		daoRef.save(employee);
	}

	@Override
	public void deleteEmployee(int empId) {
		daoRef.deleteById(empId);
	}

}
