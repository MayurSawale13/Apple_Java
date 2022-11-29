
package LoopAssignment;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter base and index:");
		int b = num.nextInt();
		int n = num.nextInt();
		int i = 1, power = 1;
		/*
		 * while(i<=n) 
		 * { power=b*power; 
		 * i++; }
		 * System.out.println(b+" to the power "+n+" :"+power);
		 */
		
		for (; i <= n; i++) {

			power = power * b;
		}
		System.out.println(b + " to the power " + n + " :" + power);
		num.close();
	}

}
