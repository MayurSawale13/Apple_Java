package pattern;

import java.util.Scanner;

/*Write a program to print following series upto n.
Accept n from user. 5, 13, 25, 41,61 , 85*/
public class Series_Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range");
		int r = sc.nextInt();

		int j = 1;

		for (int i = 1; i <= r; i++) {
			int k = 4;
			k = k * (i);
			j = j + k;
			System.out.print(j + " ");

		}

	}

}
