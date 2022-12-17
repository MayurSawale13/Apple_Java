package arrays_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class NumberTableArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to create table");
		int num = sc.nextInt();
		int a[] = new int[10];
		int j = 1;
		for (int i = 0; i < a.length; i++) {
			a[i] = num * j;
			j++;
		}
		System.out.println(Arrays.toString(a));

	}

}
