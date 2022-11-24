package com.miit.hibernateconept;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbaddableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student s1 = new Student();
		s1.setDepartment("Medical");
		s1.setSt_id(101);
		s1.setSt_name("Dhara");
	
		Student s2 = new Student();
		s2.setDepartment("Engineering");
		s2.setSt_id(201);
		s2.setSt_name("Dimpal");
		
		Course c1 = new Course();
		c1.setCollage("BJ Medical");
		c1.setCourse("BHMS");
		
		Course c2 = new Course();
		c2.setCollage("SSASIT");
		c2.setCourse("Electrical");
		
		s1.setCourse(c1);
		s2.setCourse(c2);
		
		session.save(s1);
		session.save(s2);
		
		Transaction txn = session.beginTransaction();
		
		txn.commit();
		session.close();
		factory.close();
		
	}

}
