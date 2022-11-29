package LoopAssignment;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Enter Number(Ex:18%9=0)");
		int n = num.nextInt();
		int temp = n, sum = 0, r;
		while (n != 0) {
			r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		if (temp % sum == 0)
			System.out.println("Its harshad Number");
		else
			System.out.println("Its not  harshad Number");
		num.close();
	}

}
