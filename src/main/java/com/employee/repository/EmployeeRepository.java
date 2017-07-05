package com.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.employee.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	List<Employee> findByEmpId(int empId);

	List<Employee> findByEmpNameAndEmpId(String empName, int empId);

}
