package Inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name= "Admin_id")
public class TeacherTablePerSubclass extends AdminTablePerSubclass {
	
	public int getTeacher_id() {
		return teacher_id;
	}


	public String getTeacher_name() {
		return teacher_name;
	}


	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}


	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}


	@Column(name="Teacher_Id")
	private int teacher_id;
	@Column(name="Teacher_Name")
	private String teacher_name;
	

	public TeacherTablePerSubclass() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TeacherTablePerSubclass(int admin_id, String admin_name, int teacher_id, String teacher_name) {
		super(admin_id, admin_name);
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
	}
}
