package looping;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = num.nextInt();
		int count = 0, sum = 0;
		int temp = n;
		int rem = 0;
		while (temp != 0) { // calculate count of digit
			count++;
			temp = temp / 10;
		}
		temp = n; // Reinitialize
		while (temp != 0) { // calculate power of each digit
			int p = 1;
			rem = temp % 10;
			for (int i = 1; i <= count; i++) {
				p = p * rem;

			}
			sum = sum + p; // add each digit power value to sum
			temp = temp / 10; // reduce number by one digit

		}
		System.out.println(sum);

		if (sum == n)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
		num.close();

	}

}
