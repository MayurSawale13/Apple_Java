import java.util.Scanner;

public class NumberAndDay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number Betwwen 1 And 7");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("Monday");
		case 2:
			System.out.println("Tuesday");
		case 3:
			System.out.println("Wednesday");
		case 4:
			System.out.println("Thursday");
		case 5:
			System.out.println("Friday");
		case 6:
			System.out.println("Holiday");
		case 7:
			System.out.println("holiday");
		default:
			System.out.println("Error This day Doesn't Exist");

		}
	sc.close();	
	}

}
