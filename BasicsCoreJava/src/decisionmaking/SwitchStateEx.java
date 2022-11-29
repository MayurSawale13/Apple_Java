package decisionmaking;
import java.util.Scanner;

public class SwitchStateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ch = new Scanner(System.in);
		String name = ch.nextLine();// take input as whole line
		String sname = name.toLowerCase();// String is predefined class in java
											// so 'S'
		// convert to lower case using string predefined method

		switch (sname) {
		case "maharashtra":
			System.out.println("capital of " + sname + "is Mumbai");
			break;
		case "goa":
			System.out.println("capital of " + sname + "is panaji");
			break;
		case "karnataka":
			System.out.println("capital of " + sname + "is banglore");
			break;
		case "telagana":
			System.out.println("capital of " + sname + "is Hydrabad");
			break;
		case "uttar pradesh":
			System.out.println("capital of " + sname + "is Lucknow");
			break;
		default:
			System.out.println("Enter valid state name");
		}
		ch.close();
	}

}
