package Inheritance;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@AttributeOverrides({@AttributeOverride(name="Admin_id", column = @Column),@AttributeOverride(name="Admin_Name", column = @Column)})
public class TeacherTablePerConcreteClass extends AdminTablePerConcreteClass {
	
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
	

	public TeacherTablePerConcreteClass() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TeacherTablePerConcreteClass(int admin_id, String admin_name, int teacher_id, String teacher_name) {
		super(admin_id, admin_name);
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
	}
}
