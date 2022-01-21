package com.example.MerchSpringMVCSample.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.MerchSpringMVCSample.model.Employee;
 
public interface IEmployeeDAO extends JpaRepository<Employee, Integer> {
 
    List<Employee> findByDeptName(String deptName); 
 
} 