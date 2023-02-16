package august_eclipse_test;

import java.util.Arrays;
import java.util.Scanner;

/*Write a Program in Java to accept 10 number and count no of bouncy,
increasing,  decreasing number.
Increasing Number : Working from left-to-right if no digit is exceeded by the digit to its left it is called an increasing number; 
for example, 22344.
Decreasing Number : Similarly if no digit is exceeded by the digit to its right it is called a decreasing number; for example, 774410.
Bouncy Number : We shall call a positive integer that is neither increasing nor decreasing a “bouncy” number; for example, 155349. */
public class Q1_b {
	boolean increasingNum(int num) {
		int temp = num;
		boolean flag = true;
		int p = temp % 10;
		while (temp > 0) {
			int c = temp % 10;
			System.out.print(c + " " + p + " .");
			if (c > p) {
				flag = false;
				break;
			}
			p = c;
			temp = temp / 10;

		}
		return flag;
	}

	boolean decreasingNum(int num) {
		int temp = num;
		boolean flag = true;
		int p = temp % 10;
		while (temp > 0) {
			int c = temp % 10;
			if (c < p) {
				flag = false;
				break;
			}
			p = c;
			temp = temp / 10;
		}
		return flag;
	}

	void bouncy(int num) {

		if (increasingNum(num) && decreasingNum(num))
			System.out.println("Number is not bouncy");
		else
			System.out.println("Number is bouncy");

	}

	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner (System.in);
		 * System.out.println("Enter number");
		 */
		int num = 555;

		Q1_b n = new Q1_b();
		System.out.println(n.increasingNum(num));
		System.out.println(n.decreasingNum(num));
		n.bouncy(num);
	}

}
