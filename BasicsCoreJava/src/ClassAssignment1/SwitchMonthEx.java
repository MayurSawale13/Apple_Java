package ClassAssignment1;
import java.util.Scanner;

public class SwitchMonthEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter Month Number");
		int num = ch.nextInt();

		switch (num) {
		case 1:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("The numder of days are 31");
			break;
		case 2:
			System.out.println("Enter a year");
			int year = ch.nextInt();
			if (year % 4 == 0)
				System.out.println(" LEAP YEAR The number of days are 29");
			else
				System.out.println("the number of days 28");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("The numder of days are 30");
			break;

		default:
			System.out.println("Enter valid month number");
		}
		ch.close();

	}

}
