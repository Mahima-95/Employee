package com.employee.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Client;
import com.employee.repository.ClientRepository;

@Service
@Transactional
public class ClientServiceImpl {

	@Autowired
	private ClientRepository clientRepository;

	public Client findById(int id) {
		return clientRepository.findOne(id);
	}

	public List<Client> findClientByManagerId(Integer managerId) {
		return clientRepository.findByManagerID(managerId);
	}

	public List<Client> findClientByEmployeeId(Integer employeeId) {
		return clientRepository.findByEmployeeId(employeeId);
	}

	public Client addClient(Client client) {
		return clientRepository.save(client);
	}

}
