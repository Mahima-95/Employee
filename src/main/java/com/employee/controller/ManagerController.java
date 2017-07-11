package com.employee.controller;

import java.util.List;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Managers;
import com.employee.service.impl.ManagerServiceImpl;

@RestController
@RequestMapping("/api/man")
@Api(basePath = "/manager1", value = "manager1", description = "Operations with Landlords", produces = "application/json")
public class ManagerController {

	@Autowired
	private ManagerServiceImpl managerServiceImpl;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "/get")
	@ResponseBody
	public List<Managers> getEmployeeById(@RequestBody Managers manager1) {
		return managerServiceImpl.findManagerById(manager1);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "/get/{managerID}/id")
	@ResponseBody
	public Managers getEmployeeById(@PathVariable int managerID) {
		return managerServiceImpl.findByManagerID(managerID);
	}
	
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, value = "/addManager")
	@ResponseBody
	public Managers addEmployee(@RequestBody Managers managers) {
		return managerServiceImpl.addManager(managers);
	}

}
