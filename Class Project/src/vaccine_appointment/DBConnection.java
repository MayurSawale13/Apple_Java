package vaccine_appointment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
		public static String driver="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/vaccination_db";
	static String user="root";
	static String pass="root";
	public static Connection getConnection(){
		Connection con=null;
		try {
			Class.forName(driver);
			System.out.println("driver loaded");
		 con=	DriverManager.getConnection(url, user, pass);
		 System.out.println("Connected to DB");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
