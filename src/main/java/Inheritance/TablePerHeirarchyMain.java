package Inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import HibernateUtil.HibernateUtil;


public class TablePerHeirarchyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SessionFactory factory =HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx = session.beginTransaction();
		
		AdminTablePerHeirarchy a1 = new AdminTablePerHeirarchy(101,"Dimpal Sakariya");
		session.save(a1);
		
		TeacherTablePerHeirarchy t1 = new TeacherTablePerHeirarchy(102,"Parth Madhani",1001,"Sudha patel");
		session.save(t1);
		
		StudentTablePerHeirarchy s1 = new StudentTablePerHeirarchy(103,"Ankur Patel",2001,"Alpesh Zala");
		session.save(s1);
		
		tx.commit();
		session.close();
	}

}
