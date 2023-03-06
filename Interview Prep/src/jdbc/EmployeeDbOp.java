package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class EmployeeDbOp {
	Statement stmt;
	Scanner sc=new Scanner(System.in);
	void display(Connection con){
		try {
			Statement stmt=con.createStatement();
			//executeQuery //executeUpdate 			//excute
			//select		insert,update,delete  
			ResultSet rs=stmt.executeQuery("select * from employee ");
			//System.out.println("");
			while (rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString("ename")+"  "+rs.getInt("salary")+
						" "+rs.getString("dname")+" "+rs.getInt("did"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void insert(Connection con){
		try {
			stmt=con.createStatement();
		int i=	stmt.executeUpdate("insert into employee values(15,'ganesh',60000,'HR',1)");
		if (i!=0)
			System.out.println("new row inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}
	void update(Connection con){
		
		System.out.println("Enter emp id");
		int id=sc.nextInt();
		System.out.println("enter what to update(salary/ename)");
		String udata=sc.next();
		if(udata.equalsIgnoreCase("ename")){
			System.out.println("enter ename to update");
			String name=sc.next();
			try {
				stmt=con.createStatement();
				int i=stmt.executeUpdate("update employee set ename='"+name+"' where eid="+id);
			if(i!=0){
				System.out.println("row update at id: "+id);
			}
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
		if(udata.equalsIgnoreCase("salary")){
			System.out.println("enter salary");
			int sal=sc.nextInt();
			try {
			stmt=con.createStatement();
			int i=stmt.executeUpdate("update employee set salary="+sal+" where eid="+id);
			if(i!=0)
				System.out.println("salary updated at eid "+id);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
	void delete(Connection con){
		try {
			stmt=con.createStatement();
		int i=	stmt.executeUpdate("delete from employee where eid=15");
		if (i!=0)
			System.out.println(" row deleted ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
