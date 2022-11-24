package com.miit.hibernateconept;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Library l1 = new Library();
		l1.setBookid(2525);
		l1.setBookname("Life");
		
		Library l2 = new Library();
		l2.setBookid(3535);
		l2.setBookname("Magic");
		
		List<Library> list1 =new ArrayList<Library>();
		list1.add(l1);
		list1.add(l2);
		
		Member m1 = new Member();
		m1.setMid(101);
		m1.setMname("Dimpal Sakariya");
		m1.setLibrary(list1);
		
		Member m2 = new Member();
		m2.setMid(102);
		m2.setMname("Bhumi Lad");
		m2.setLibrary(list1);
		
		List<Member> list2 =new ArrayList<Member>();
		list2.add(m1);
		list2.add(m2);
		
		l1.setMember(list2);
		l2.setMember(list2);
		
		session.save(l1);
		session.save(l2);
		session.save(m1);
		session.save(m2);
		
		Transaction txn = session.beginTransaction();

		txn.commit();
		session.close();
		factory.close();
	}

}
