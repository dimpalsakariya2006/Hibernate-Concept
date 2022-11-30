package Inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
	    name="discriminator",
	    discriminatorType=DiscriminatorType.STRING
	)
@DiscriminatorValue(value="A")
public class AdminTablePerHeirarchy {

	public int getAdmin_id() {
		return admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	@Id
	@Column(name= "Admin_id")
	private int admin_id;
	@Column(name="Admin_Name")
	private String admin_name;
	public AdminTablePerHeirarchy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminTablePerHeirarchy(int admin_id, String admin_name) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
	}

	
	
	
	
}
