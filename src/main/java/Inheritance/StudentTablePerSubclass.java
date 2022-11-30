package Inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
@PrimaryKeyJoinColumn(name= "Admin_id")
public class StudentTablePerSubclass extends AdminTablePerSubclass {


	public int getStudent_id() {
		return student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	@Column(name="Student_id")
	private int student_id;
	@Column(name="Student_Name")
	private String student_name;
	public StudentTablePerSubclass(int admin_id, String admin_name, int student_id, String student_name) {
		super(admin_id, admin_name);
		this.student_id = student_id;
		this.student_name = student_name;
	}
	public StudentTablePerSubclass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
