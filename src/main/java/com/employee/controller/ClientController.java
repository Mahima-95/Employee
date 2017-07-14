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

import com.employee.entity.Client;
import com.employee.service.impl.ClientServiceImpl;

@RestController
@RequestMapping("/api/")
public class ClientController {

	@Autowired
	private ClientServiceImpl clientServiceImpl;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "/get/client/{managerId}/managerid")
	@ResponseBody
	public List<Client> getClientByManagerId(@PathVariable Integer managerId) {
		return clientServiceImpl.findClientByManagerId(managerId);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "/get/client/{employeeId}/employeeid")
	@ResponseBody
	public List<Client> getClientByEmployeeId(@PathVariable Integer employeeId) {
		return clientServiceImpl.findClientByEmployeeId(employeeId);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "/get/client/{clientId}/id")
	@ResponseBody
	public Client getByClientId(@PathVariable Integer clientId) {
		return clientServiceImpl.findById(clientId);
	}

	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, value = "/add/client")
	@ResponseBody
	public Client addclient(@RequestBody Client client) {
		return clientServiceImpl.addClient(client);
	}
}
