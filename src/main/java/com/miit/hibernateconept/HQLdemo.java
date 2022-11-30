package com.miit.hibernateconept;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLdemo {
	public static void main(String[] args) {

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

		Student s3 = new Student();
		s3.setDepartment("Engineering");
		s3.setSt_id(301);
		s3.setSt_name("Pruthvi");

		Course c1 = new Course();
		c1.setCollage("BJ Medical");
		c1.setCourse("BHMS");

		Course c2 = new Course();
		c2.setCollage("SSASIT");
		c2.setCourse("Electrical");

		s1.setCourse(c1);
		s2.setCourse(c2);
		s3.setCourse(c2);

		session.save(s1);
		session.save(s2);
		session.save(s3);
		Transaction txn = session.beginTransaction();

		txn.commit();
		
		// fetch table from database
		Query query = session.createQuery("from Student");
		List<Student> list = query.list();
		for (Student s : list) {
			System.out.println(s);
		}

		Query query2 = session.createQuery("from Student where st_id=201");
		Student list1 = (Student) query2.uniqueResult();
		System.out.println(list1);
		
		Query query3 = session.createQuery("select st_name,st_id,department from Student where st_id=201");
		Object[] student = (Object[]) query3.uniqueResult();
		
		for(Object o : student)
		{
			System.out.println(o);
		}
		
		//native queries...
		SQLQuery q = session.createSQLQuery("select*from student");
		q.addEntity(Student.class);
		List <Student> students = q.list();
		for (Student s : students) {
			System.out.println(s);
		}
		
		SQLQuery q1 = session.createSQLQuery("select student_name, department from student");
		q1.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		List students1 = q1.list();
		for(Object o : students1)
		{
			Map m = (Map)o;
			System.out.println(m.get("student_name")+" "+ m.get("department"));
		}
		session.close();
		factory.close();
	}
}
