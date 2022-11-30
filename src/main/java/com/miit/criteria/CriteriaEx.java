package com.miit.criteria;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.miit.hibernateconept.Student;

public class CriteriaEx {

	public static void main(String[] args) {
		
		Session session= new Configuration().configure().buildSessionFactory().openSession();
		Criteria c=session.createCriteria(Student.class);
		
		Student s1 = new Student();
		s1.setDepartment("Medical");
		s1.setSt_id(101);
		s1.setSt_name("Dhara");

		Student s2 = new Student();
		s2.setDepartment("Engineering");
		s2.setSt_id(201);
		s2.setSt_name("Dimpal");

		Student s3 = new Student();
		s3.setDepartment("Engineering");
		s3.setSt_id(301);
		s3.setSt_name("Pruthvi");
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		
		Transaction tx = session.beginTransaction();
		tx.commit();
		
//		c.add(Restrictions.eq("department", "Engineering"));
//		c.add(Restrictions.gt("st_id", 101));
//		c.add(Restrictions.lt("st_id", 201));
		c.add(Restrictions.like("st_name", "D%"));
		
		List<Student> students = c.list();
		for(Student s : students)
		{
			System.out.println(s);
		}
		
		
		
		session.close();
	}
}
