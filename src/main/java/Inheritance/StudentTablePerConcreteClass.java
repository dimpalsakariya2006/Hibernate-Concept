package Inheritance;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@AttributeOverrides({@AttributeOverride(name="Admin_id", column = @Column),@AttributeOverride(name="Admin_Name", column = @Column)})
public class StudentTablePerConcreteClass extends AdminTablePerConcreteClass {


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
	public StudentTablePerConcreteClass(int admin_id, String admin_name, int student_id, String student_name) {
		super(admin_id, admin_name);
		this.student_id = student_id;
		this.student_name = student_name;
	}
	public StudentTablePerConcreteClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
