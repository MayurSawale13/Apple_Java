package LoopAssignment;

import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number to get table:");
		int n = num.nextInt();
		int i = 1;
		/*
		 * while(i<=10) { System.out.println(n+"*"+i+"  "+n*i); i++; }
		 */
		for (; i <= 10; i++) {
			System.out.println(n + "*" + i + "  " + n * i);
		}
		num.close();

	}

}
