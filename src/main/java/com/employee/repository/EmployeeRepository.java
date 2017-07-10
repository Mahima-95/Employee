package com.employee.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.employee.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	Employee findByEmpId(int empId);

	List<Employee> findByEmpNameAndEmpId(String empName, int empId);

	@Query("SELECT p FROM Employee p WHERE LOWER(p.empName) = LOWER(:empName)")
	List<Employee> find(@Param("empName") String empName);
}
