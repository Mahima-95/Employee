package com.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.employee.entity.Manager;

public interface ManagerRepository extends CrudRepository<Manager, Integer> {

	List<Manager> findByEmployeeId(Integer id);

}
