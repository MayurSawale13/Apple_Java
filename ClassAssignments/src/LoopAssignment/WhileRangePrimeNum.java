package LoopAssignment;

import java.util.Scanner;

public class WhileRangePrimeNum {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter start(400) number or range ");
		int n1 = num.nextInt();
		System.out.println("Enter end(200) number or range ");
		int n2 = num.nextInt();
		int count = 0;
		while (n1 > n2) {
			int check = 0;
			for (int i = 2; i <= n1 / 2; i++) { 	// check number is prime or not
				if (n1 % i == 0) {
					check = 1;
					break; 							// if number is not prime move out loop
				}

			}
			if (check != 1 ) { 							// check flag and
														// number!=0,1
				System.out.println(n1);
				count++;
			}
			n1--;
		}
		System.out.println("Total count of prime numbers :" + count);
		num.close();

	}

}
