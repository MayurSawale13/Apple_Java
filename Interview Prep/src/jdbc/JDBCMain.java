package jdbc;

import java.sql.Connection;

public class JDBCMain {

	public static void main(String[] args) {
		EmployeeDbOp emp=new EmployeeDbOp();
		Connection con=DBconnection.connection();
		//emp.insert(con);
		emp.display(con);
		//emp.update(con);
		emp.delete(con);
		emp.display(con);
	}

}
