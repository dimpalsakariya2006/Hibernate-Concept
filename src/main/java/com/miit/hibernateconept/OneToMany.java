package com.miit.hibernateconept;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Employee e1 = new Employee();
		e1.setEmpid(101);
		e1.setEmpname("Nikunj");
		
		Employee e2 = new Employee();
		e2.setEmpid(102);
		e2.setEmpname("Dimpal");
		
		Employee e3 = new Employee();
		e3.setEmpid(103);
		e3.setEmpname("Bhumi");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
	
		
		Department d = new Department();
		d.setDid(25);
		d.setDname("Electrical");
		d.setEmployees(list);
		
		e1.setDepartment(d);
		e2.setDepartment(d);
		e3.setDepartment(d);
		session.save(d);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		
		Transaction txn = session.beginTransaction();

		txn.commit();
		session.close();
		factory.close();
	}

}
