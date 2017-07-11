/*package com.employee.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "manager")
@Entity
public class Manager {

	@Id
	@Column(name = "manager_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int managerID;

	@Column(name = "manager_name")
	private String managerName;

	@Column(name = "manager_address")
	private String managerAddress;

	@OneToMany(mappedBy = "manager", cascade = CascadeType.ALL)
	Set<Employee> employees;

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
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

	@Override
	public String toString() {
		return "Manager [managerID=" + managerID + ", managerName="
				+ managerName + ", managerAddress=" + managerAddress
				+ ", employees=" + employees + "]";
	}

}
*/