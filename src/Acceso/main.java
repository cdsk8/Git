package Acceso;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class main {
	public static void main(String[] Args) {
		
		String jdbcUrl="jdbc:mysql://localhost:3306/jardineria-test?useSSL=false";
		String user="jardineria-test";
		String pass="jardineria-test";
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myConn=  (Connection) DriverManager.getConnection(jdbcUrl,user,pass);
			
			System.out.println("JAJA");
		}
		catch(Exception exc) {
			System.out.println("COSA POCJA");
			exc.printStackTrace();
		}
		
	}

}
