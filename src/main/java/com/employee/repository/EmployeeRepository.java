package com.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.employee.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	List<Employee> findByEmployeeName(String empployeeName);

	// @Query("SELECT p FROM Employee p WHERE LOWER(p.empName) =
	// LOWER(:empName)")
	// List<Employee> find(@Param("empName") String empName);
}
