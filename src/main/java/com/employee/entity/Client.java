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
@Table(name = "client")
public class Client {

	@Id
	@Column(name = "client_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clientId;

	@Column(name = "client_name")
	private String clientName;

	@Column(name = "client_address")
	private String clientAddress;

	@Column(name = "manager_id")
	private int managerID;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "manager_id", referencedColumnName = "manager_id", updatable = false, insertable = false)
	private Manager managers;

	@Column(name = "employee_Id")
	private int employeeId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id", referencedColumnName = "employee_Id", updatable = false, insertable = false)
	private Employee employees;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Employee getEmployee() {
		return employees;
	}

	public void setEmployee(Employee employee) {
		this.employees = employee;
	}

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	public Manager getManager() {
		return managers;
	}

	public void setManager(Manager manager) {
		this.managers = manager;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientName=" + clientName
				+ ", clientAddress=" + clientAddress + ", managerID="
				+ managerID + ", manager=" + managers + ", employeeId="
				+ employeeId + ", employee=" + employees + "]";
	}

}
