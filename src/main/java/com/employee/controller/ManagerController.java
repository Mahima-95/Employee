package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Manager;
import com.employee.service.impl.ManagerServiceImpl;

@RestController
@RequestMapping("/api/")
public class ManagerController {

	@Autowired
	private ManagerServiceImpl managerServiceImpl;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "/get/managers/{employeeId}/id")
	@ResponseBody
	public List<Manager> getManagersByEmployeeId(@PathVariable Integer employeeId) {
		return managerServiceImpl.findManagerByEmployeeId(employeeId);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "/get/{managerId}/id")
	@ResponseBody
	public Manager getManagerById(@PathVariable Integer managerId) {
		return managerServiceImpl.findByManagerID(managerId);
	}

	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, value = "/add/manager")
	@ResponseBody
	public Manager addManager(@RequestBody Manager manager) {
		return managerServiceImpl.addManager(manager);
	}

}
