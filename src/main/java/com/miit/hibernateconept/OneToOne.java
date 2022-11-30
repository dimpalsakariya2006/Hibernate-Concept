package com.miit.hibernateconept;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


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
		
		//retrive data
		
		Person p =(Person) session.get(Person.class, 1);
		System.out.println(p.getPid()+" "+p.getPname());
		
		Laptop l =(Laptop) session.get(Laptop.class, 1212);
		System.out.println(l.getLid()+" "+l.getLname());
		
//		String SQL_QUERY = "from Laptop laptop";
//		Query query = session.createQuery(SQL_QUERY);
//		List<Laptop> laptoplist = query.list();
//		for (Iterator iterator = laptoplist.iterator(); iterator.hasNext();) {
//			Laptop obj = (Laptop) iterator.next();
//			System.out.println("Laptopp Name: " + obj.getLname());

		Transaction txn = session.beginTransaction();

		txn.commit();
		session.close();
		factory.close();
	}

	}

