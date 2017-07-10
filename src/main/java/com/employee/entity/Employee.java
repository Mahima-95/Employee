package com.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
// no need to use this query for @Query annotation right now
// @NamedQuery(name = "Employee.findByName", query =
// "SELECT p FROM Employee p WHERE LOWER(p.empName) = LOWER(?1)")
@Table(name = "emp")
public class Employee {

	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;

	@Column(name = "emp_name")
	private String empName;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "manager_id") private Manager manager;
	 * 
	 * public Manager getManager() { return manager; }
	 * 
	 * public void setManager(Manager manager) { this.manager = manager; }
	 */

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

}
// https://www.petrikainulainen.net/programming/spring-framework/spring-data-jpa-tutorial-three-custom-queries-with-query-methods/
