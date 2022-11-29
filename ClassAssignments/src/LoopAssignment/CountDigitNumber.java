package LoopAssignment;

import java.util.Scanner;

public class CountDigitNumber {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = num.nextInt();
		int count = 0, n1 = n;

		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println("number of digit in " + n1 + "=" + count);
		num.close();

	}

}
