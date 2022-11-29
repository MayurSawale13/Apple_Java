package oops;

import java.util.Scanner;

public class ArmstrongNum {

	void checkNum(int n)
	{
		int r,n1=n,temp=n,sum=0,count=0;
		while(n1>0)
		{
			n1=n1/10;
			count++;
		}
		System.out.println(count);
		while(count>0)
		{
			r=n%10;
			sum+=r*r*r;
			n=n/10;
			count--;
		}
		if(sum==temp)
			System.out.println(temp+" is Armstrong Number");
		else
			System.out.println(temp+" is not Armstrong number");
	}
	public static void main(String[] args) {
		ArmstrongNum a=new ArmstrongNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		
		a.checkNum(n);
		sc.close();
	}

}
