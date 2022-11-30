package HibernateUtil;
 
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class HibernateUtil {
 
    //private static final SessionFactory sessionFactory = buildSessionFactory();
	private static SessionFactory sessionFactory;
 
    public static SessionFactory getSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
        	sessionFactory = new Configuration().configure("hibernate.cfg.xml")
					.buildSessionFactory();
                    
        	return sessionFactory;
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
 
}

