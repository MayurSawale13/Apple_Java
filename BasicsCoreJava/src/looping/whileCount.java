package looping;

import java.util.Scanner;

public class whileCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		System.out.println("Enter number range:");
		int limit=num.nextInt();
		int i = 1;
		int sum = 0, sum1 = 0, p1 = 1, p2 = 1;
		while (i <= limit) {
			if (i % 2 == 0) {
				sum += i;
			} else {
				sum1 = sum1 + i;
			}
			i++;
		}
		System.out.println("even Number sum :" + sum);
		System.out.println("ood Number sum: " + sum1);
		i = 1;
		while (i <= limit) {
			if (i % 2 == 0) {
				p1 *= i;

			} else {
				p2 *= i;

			}
			i++;

		}
		System.out.println("even number product :" + p1);
		System.out.println("ood number product: " + p2);
		num.close();
	}
}
