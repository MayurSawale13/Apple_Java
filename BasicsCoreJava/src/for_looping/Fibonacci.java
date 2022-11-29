package for_looping;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a range for Fibonacci series");
		int range = num.nextInt();
		int n1 = 0, n2 = 1, n3;
		System.out.println("Fibonacci Series: ");
		for (int i = 1; i <= range; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n1);
			n1 = n2;
			n2 = n3;
		}
		num.close();

	}

}
