package com.miit.hibernateconept;

import javax.persistence.*;

import javax.persistence.Embeddable;

@Embeddable
public class Course {
	
	@Override
	public String toString() {
		return "Course [course=" + course + ", collage=" + collage + "]";
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	@Column
	private String course;
	@Column
	private String collage;
	

}
