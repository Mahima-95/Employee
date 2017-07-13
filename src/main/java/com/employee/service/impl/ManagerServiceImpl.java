package com.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.entity.Manager;
import com.employee.repository.ManagerRepository;

@Service
@Transactional
public class ManagerServiceImpl {

	@Autowired
	private ManagerRepository managerRepository;

	public List<Manager> findManagerByEmployeeId(Integer id) {
		return managerRepository.findByEmployeeId(id);
	}

	public Manager findByManagerID(int managerId) {
		return managerRepository.findOne(managerId);
	}

	public Manager addManager(Manager managers) {
		return managerRepository.save(managers);
	}
}
