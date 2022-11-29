package AssignmentOnSwitch;

import java.util.Scanner;

public class NumberToWord {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a Number betwwen 1 to 5");
		int n = num.nextInt();
		switch (n) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
			System.out.println("Invalid Number,enter number between 1 to 5");
		}
		num.close();

	}

}
