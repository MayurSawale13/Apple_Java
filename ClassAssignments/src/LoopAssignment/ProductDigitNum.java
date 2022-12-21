package LoopAssignment;

import java.util.Scanner;

public class ProductDigitNum {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = num.nextInt();
		int n1 = n,rem,prod=1;

		while (n > 0) {
			rem=n%10;
			prod*=rem;
			n = n / 10;
			
		}
		System.out.println("product of digit of " + n1 + "=" + prod);
		num.close();
		
	}

}
