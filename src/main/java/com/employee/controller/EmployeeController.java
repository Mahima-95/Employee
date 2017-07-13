package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.impl.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "/get/employee/{empId}/id")
	@ResponseBody
	public Employee getEmployeeById(@PathVariable int empId) {
		return employeeServiceImpl.findEmployeeById(empId);
	}

	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, value = "/add/employee")
	@ResponseBody
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeServiceImpl.addEmployee(employee);
	}

	@RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, value = "/update/employee")
	@ResponseBody
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeServiceImpl.updateEmployee(employee);
	}

	@RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, value = "/delete/employee/{empId}")
	@ResponseBody
	public Employee deleteEmployee(@PathVariable int empId) {
		return employeeServiceImpl.deleteEmployee(empId);
	}

	// to find name by using @Query annotation
	@RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, value = "/get/name")
	@ResponseBody
	public List<Employee> findByName(@RequestParam String empName) {
		return employeeServiceImpl.findByName(empName);
	}

}
