package com.employee.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "manager")
public class Manager {

	@Id
	@Column(name = "manager_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int managerID;

	@Column(name = "employee_Id")
	private Integer employeeId;

	@Column(name = "manager_name")
	private String managerName;

	@Column(name = "manager_address")
	private String managerAddress;

	@Column(name = "manager_age")
	private int managerAge;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id", referencedColumnName = "employee_Id", updatable = false, insertable = false)
	private Employee employees;

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerAddress() {
		return managerAddress;
	}

	public void setManagerAddress(String managerAddress) {
		this.managerAddress = managerAddress;
	}

	public int getManagerAge() {
		return managerAge;
	}

	public void setManagerAge(int managerAge) {
		this.managerAge = managerAge;
	}

	public Employee getEmployees() {
		return employees;
	}

	public void setEmployees(Employee employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Manager [managerID=" + managerID + ", employeeId=" + employeeId + ", managerName=" + managerName
				+ ", managerAddress=" + managerAddress + ", managerAge=" + managerAge + ", employees=" + employees
				+ "]";
	}

}
