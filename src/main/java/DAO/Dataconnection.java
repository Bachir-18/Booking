package DAO;
import java.sql.Connection;

import java.sql.DriverManager;

public class Dataconnection {
		private static Connection con;
		static
		{
				try {
					Class.forName("com.mysql.jdbc.Driver");
		            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Booking","root","");
		            System.out.println("Connection réussie;");
				} catch (Exception e) {
					e.printStackTrace();
				}
			
	}
		public static Connection getCon() {
			return con;
		}
		
		

}
