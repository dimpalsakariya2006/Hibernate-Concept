package com.miit.hibernateconept;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Member {

	@Id
	@Column(name="Member_Id")
	private int mid;
	@Column(name="Member_Name")
	private String mname;
	@ManyToMany(mappedBy="member", fetch= FetchType.EAGER)
	private List<Library> library;
	
	public List<Library> getLibrary() {
		return library;
	}
	public void setLibrary(List<Library> library) {
		this.library = library;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	
}
