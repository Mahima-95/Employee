package com.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.entity.Managers;
import com.employee.repository.ManagerRepository;

@Service
@Transactional
public class ManagerServiceImpl {
	@Autowired
	private ManagerRepository managerRepository;

	public List<Managers> findManagerById(Managers manager1) {
		return managerRepository.findByEmployees(manager1);
	}

	public Managers findByManagerID(int managerID) {
		return managerRepository.findByManagerID(managerID);
	}
	
	public Managers addManager(Managers managers) {
		return managerRepository.save(managers);
	}
}
