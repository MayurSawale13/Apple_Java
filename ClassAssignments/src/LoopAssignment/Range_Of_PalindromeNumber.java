package LoopAssignment;

import java.util.Scanner;

public class Range_Of_PalindromeNumber {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter Start and End Number(100-200)");
		int n1 = num.nextInt();
		int n2 = num.nextInt();
		System.out.println("Palindrome Number from " + n1 + " to " + n2 + " :");

		for (int i = n1; i <= n2; i++) {
			int n = i;
			int temp = n, r, sum = 0;
			while (n != 0) {
				r = n % 10;
				sum = sum * 10 + r;
				n = n / 10;
			}
			if (temp == sum) {
				System.out.println(sum);
			}

		}
		num.close();
	}

}
