package LoopAssignment;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = num.nextInt();
		int temp = n, rev = 0, rem;
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println(" " + rev);
		if (temp == rev) {
			System.out.println("The number is revesre number");
		} else {
			System.out.println("The number is not revesre number");
		}
		num.close();
	}

}
