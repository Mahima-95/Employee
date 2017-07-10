package com.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.employee.entity.Employee;
import com.employee.entity.Manager;
import com.employee.entity.Managers;

public interface ManagerRepository extends CrudRepository<Managers, Integer> {

	List<Managers> findByEmployees(Managers manager1);
	
	Managers findByManagerID(int managerID);
	
}
