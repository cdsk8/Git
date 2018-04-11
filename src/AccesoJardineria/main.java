package AccesoJardineria;

import java.sql.DriverManager;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.jdbc.Connection;

public class main {
	protected static SessionFactory sessionFactory; 
	   public static void main(String[] args) {
		   try {
		         sessionFactory = new Configuration().configure().buildSessionFactory();
		      } catch (Throwable ex) { 
		         System.err.println("Failed to create sessionFactory object." + ex);
		         throw new ExceptionInInitializerError(ex); 
		      }
	      Scanner scan=new Scanner(System.in);
	      String nombre=scan.nextLine();
	      String apellidos=scan.nextLine();
	      String direccion=scan.nextLine();
ManageCliente.addCliente(nombre, apellidos, direccion);
	    
	   }


}
