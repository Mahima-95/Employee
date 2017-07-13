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

	public Employee findEmployeeById(int empId) {
		return employeeRepository.findOne(empId);
	}

	/*public List<Employee> findEmployeeByNameAndId(String empName, int empId) {
		return employeeRepository.findByEmpNameAndEmpId(empName, empId);
	}*/

	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee updateEmployee(Employee employee) {
		Employee tempEmployee = employeeRepository.findOne(employee.getEmployeeId());
		if (tempEmployee != null && employee.getEmployeeName() != null) {
			tempEmployee.setEmployeeId(employee.getEmployeeId());
			tempEmployee.setEmployeeName(employee.getEmployeeName());
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

	public List<Employee> findByName(String employeeName) {
		return employeeRepository.findByEmployeeName(employeeName);
	}
}
