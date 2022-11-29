package oops;

import java.util.Scanner;

public class NumDigitSum {

	void digitSum(int n)
	{
		int r,sum=0;
		while(n>0)
		{
			r=n%10;
			sum+=r;
			n=n/10;
		}
		System.out.println("Sum of Digit is: "+sum);
	}
	public static void main(String[] args) {
		NumDigitSum s=new NumDigitSum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		s.digitSum(n);
		sc.close();
		
	}
}
