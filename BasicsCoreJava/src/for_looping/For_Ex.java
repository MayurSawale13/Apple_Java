package for_looping;

import java.util.Scanner;

public class For_Ex {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("enter number to find factorial");
		int n = num.nextInt();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is: " + fact);
		num.close();

	}

}
