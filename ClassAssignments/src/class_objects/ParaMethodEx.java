package class_objects;

import java.util.Scanner;

public class ParaMethodEx {
	void nationlGame(String s)
	{
		switch(s){
		case "india":
			System.out.println("National game of "+s+ " is Hockey");
			break;
		case "bangladesh":
			System.out.println("National game of "+s+ " is Kabbadi");
			break;
		case "italy":
			System.out.println("National game of "+s+ " is Football");
			break;
		case "united states":
			System.out.println("National game of "+s+ " is Baseball");
			break;
		default:
			System.out.println("Enter valid Country from list!!!");
		}
	}

	public static void main(String[] args) {
		ParaMethodEx c=new ParaMethodEx();
		Scanner st=new Scanner(System.in);
		System.out.println("Enter Country from list:"
				+ "\n1.India\n2.Bangladesh\n3.Italy\n4.United States ");
		String s1=st.nextLine();
		String s=s1.toLowerCase();
		c.nationlGame(s);
		st.close();
	}

}
