package Inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import HibernateUtil.HibernateUtil;

public class OneTablePerSubclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory =HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx = session.beginTransaction();
		
		AdminTablePerSubclass a1 = new AdminTablePerSubclass(101,"Pilar Rastogi");
		session.save(a1);
		
		TeacherTablePerSubclass t1 = new TeacherTablePerSubclass(102,"Pratyusha Benaraji",1001,"Sidhdharth Shukla");
		session.save(t1);
		
		StudentTablePerSubclass s1 = new StudentTablePerSubclass(103,"Sandhya Patel",2001,"Hetal Chaturvedi");
		session.save(s1);
		
		tx.commit();
		session.close();
	}

}
