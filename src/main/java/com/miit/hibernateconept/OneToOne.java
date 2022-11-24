package com.miit.hibernateconept;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Person p1 = new Person();
		p1.setPid(1);
		p1.setPname("Dimpal Sakariya");
		
		Laptop l1 = new Laptop();
		l1.setLid(1212);
		l1.setLname("Lenovo");
		l1.setPerson(p1);
		p1.setLaptop(l1);
		
		session.save(p1);
		session.save(l1);

		Transaction txn = session.beginTransaction();

		txn.commit();
		session.close();
		factory.close();
	}

}
