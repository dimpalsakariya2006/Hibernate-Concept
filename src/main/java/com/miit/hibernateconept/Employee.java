package com.miit.hibernateconept;

import javax.persistence.*;

@Entity
public class Employee {

	@Id
	@Column(name="Employee_Id")
	private int empid;
	@Column(name="Emplyee_Name")
	private String empname;
	@ManyToOne
	private Department department;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	
}
