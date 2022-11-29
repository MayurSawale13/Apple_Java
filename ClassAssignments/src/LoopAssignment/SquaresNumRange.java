package LoopAssignment;

import java.util.Scanner;

public class SquaresNumRange {

	public static void main(String[] args) {
		Scanner sq = new Scanner(System.in);
		System.out.println("Enter Range limit:(1-Range)");
		int n = sq.nextInt();
		int i = 1;
		/*
		 * while(i<=n) { 
		 * System.out.println(i+"*"+i+" " +i*i);
		 *  i++; }
		 */
		for (; i <= n; i++) {
			System.out.println(i + "*" + i + " " + i * i);
		}
		sq.close();

	}

}
