package com.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.employee.entity.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {

	public List<Client> findByManagerID(int managerId);
	
	public List<Client> findByEmployeeId(int employeeId);
}
