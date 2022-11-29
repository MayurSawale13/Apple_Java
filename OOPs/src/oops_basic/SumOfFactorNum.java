package oops_basic;

import java.util.Scanner;

public class SumOfFactorNum {
	void sum(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				
				sum += i;
			}

		}
		System.out.println("sum:" + sum);
	}

	public static void main(String[] args) {
		
		SumOfFactorNum s = new SumOfFactorNum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		s.sum(a);
		sc.close();
	}

}
