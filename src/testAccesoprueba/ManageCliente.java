package testAccesoprueba;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageCliente {


	   

	   public static Integer addCliente(String fname, String lname, String adress){
	      Session session = main.sessionFactory.openSession();
	      Transaction tx = null;
	      Integer clienteId= null;
	      
	      try {
	         tx = session.beginTransaction();
	         Cliente cliente=new Cliente(fname,lname,adress);
	       clienteId = (Integer) session.save(cliente); 
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return clienteId;
	   }
	  
}
