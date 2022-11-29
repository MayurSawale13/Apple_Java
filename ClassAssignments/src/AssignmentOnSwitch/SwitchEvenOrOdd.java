package AssignmentOnSwitch;

import java.util.Scanner;

public class SwitchEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = num.nextInt();
		int numcheck = 0;
		if (n % 2 == 0) {
			numcheck = 1;	//set numcheck 1 if even
		} else
			numcheck = 2;	//set numcheck 2 if odd
		switch (numcheck) {
		case 1:
			System.out.println(n + " is Even Number");
			break;
		case 2:
			System.out.println(n + " is odd Number");
			break;
		default:
			System.out.println("Please!! Enter a valid number");
		}
		num.close();

	}

}
