package com.employee.controller;

import java.util.List;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.impl.EmployeeServiceImpl;

@RestController
@RequestMapping("/emp")
@Api(basePath = "/employee", value = "employee", description = "Operations with Landlords", produces = "application/json")
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "/get/{empId}/empId")
	@ResponseBody
	public List<Employee> getEmployeeById(int empId) {
		return employeeServiceImpl.findEmployeeById(empId);
	}

	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, value = "/addEmployee")
	@ResponseBody
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeServiceImpl.addEmployee(employee);
	}

	@RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, value = "/updateEmployee")
	@ResponseBody
	public Employee updateEmployee(Employee employee) {
		return employeeServiceImpl.updateEmployee(employee);
	}

	@RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, value = "/deleteEmployee/{empId}")
	@ResponseBody
	public Employee deleteEmployee(int empId) {
		return employeeServiceImpl.deleteEmployee(empId);

	}
}
