package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	public static String driver="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/apple";
	static String username="root";
	static String password="root";
	static Connection connection(){
		Connection con=null;
		try{
		Class.forName(driver);
		System.out.println("Driver Loaded");
		con=DriverManager.getConnection(url, username, password);
		System.out.println("Connected to Db");
	}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	

}
