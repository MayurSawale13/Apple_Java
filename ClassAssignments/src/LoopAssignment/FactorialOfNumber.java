package LoopAssignment;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner num = new Scanner(System.in);
		System.out.println("Enter Number s:");
		int n = num.nextInt();
		int fact=1,i=1;
	/*	while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of "+n+": "+fact);*/
		for(;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+": "+fact);
		num.close();
		
	}

}
