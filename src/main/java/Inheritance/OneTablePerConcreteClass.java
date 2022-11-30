package Inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import HibernateUtil.HibernateUtil;

public class OneTablePerConcreteClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory =HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx = session.beginTransaction();
		
		AdminTablePerConcreteClass a1 = new AdminTablePerConcreteClass(101,"Pilar Rastogi");
		session.save(a1);
		
		TeacherTablePerConcreteClass t1 = new TeacherTablePerConcreteClass(102,"Pratyusha Benaraji",1001,"Sidhdharth Shukla");
		session.save(t1);
		
		StudentTablePerConcreteClass s1 = new StudentTablePerConcreteClass(103,"Sandhya Patel",2001,"Hetal Chaturvedi");
		session.save(s1);
		
		tx.commit();
		session.close();
	}

}
