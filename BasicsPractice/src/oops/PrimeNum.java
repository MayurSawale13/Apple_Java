package oops;

import java.util.Scanner;

public class PrimeNum {

	void primeCheck(int a, int b) {
		while (a < b) {
			boolean check = false;
			for (int i = 2; i < a / 2; i++) {
				if (a % i == 0) {
					check = true;
					break;
				}

			}
			if (check == false)
				System.out.println(a);
			a++;
		}
	}

	public static void main(String[] args) {
		PrimeNum p = new PrimeNum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range");
		int a = sc.nextInt();
		int b = sc.nextInt();
		p.primeCheck(a, b);
		sc.close();

	}

}
