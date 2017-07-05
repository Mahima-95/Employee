package com.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> findEmployeeById(int empId) {
		return employeeRepository.findByEmpId(empId);
	}

	public List<Employee> findEmployeeByNameAndId(String empName, int empId) {
		return employeeRepository.findByEmpNameAndEmpId(empName, empId);
	}

	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee updateEmployee(Employee employee) {
		Employee tempEmployee = employeeRepository.findOne(employee.getEmpId());
		if (tempEmployee != null && employee.getEmpName() != null) {
			tempEmployee.setEmpId(employee.getEmpId());
			tempEmployee.setEmpName(employee.getEmpName());
			return employeeRepository.save(tempEmployee);
		} else {
			return new Employee();
		}
	}

	public Employee deleteEmployee(int empId) {
		Employee employee = employeeRepository.findOne(empId);
		if (employee != null) {
			employeeRepository.delete(employee);
			return employee;
		} else {
			return new Employee();
		}
	}
}
