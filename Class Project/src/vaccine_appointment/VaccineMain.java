package vaccine_appointment;

import java.sql.Connection;

public class VaccineMain {

	public static void main(String[] args) {
		Connection con=DBConnection.getConnection();
		VaccineOpeartion vo=new VaccineOpeartion();
		//vo.appointment(con);
		vo.display(con);
	}

}
