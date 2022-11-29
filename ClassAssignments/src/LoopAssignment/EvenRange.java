 package LoopAssignment;

import java.util.Scanner;

public class EvenRange {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Enter range start(121) number: ");
		int i = num.nextInt();
		System.out.println("Enter range End(229) Number");
		int n = num.nextInt();
		System.out.println("Even Numbers Between " + i + "-" + n);
		while (i < n) {
			if (i % 2 == 0) {
				System.out.println(+i);
			}
			i++;
		}
		num.close();
	}

}
