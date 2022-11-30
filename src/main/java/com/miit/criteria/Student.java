package com.miit.criteria;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Student_Id")
	private int st_id;
	
	@Column(name="Student_Name")
	private String st_name;
	
	@Override
	public String toString() {
		return "Student [st_id=" + st_id + ", st_name=" + st_name + ", department=" + department + "]";
}

	public int getSt_id() {
		return st_id;
	}

	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}

	public String getSt_name() {
		return st_name;
	}

	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Column
	private String department;
}
