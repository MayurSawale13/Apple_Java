package vaccine_appointment;

import java.sql.Connection;
import java.util.Scanner;

public class VaccineMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=DBConnection.getConnection();
		VaccineOpeartion vo=new VaccineOpeartion();
		vo.appointment(con);
		/*//vo.slotDisplay(con);
		vo.display(con, 11);*/
		/*String ch="";
		do{
			System.out.println("Enter choice: "
					+ "1.book appointment \n"
					+ "2.search user ");
			int c=sc.nextInt();
			switch(c){
			case 1:vo.appointment(con);
				//vo.display(con);
				break;
			case 2:vo.display(con);
				break;
			}
			System.out.println("Do you want to continue:y/n");
		}while(ch.equalsIgnoreCase("y"));
		sc.close();*/
		
		
	}

}
