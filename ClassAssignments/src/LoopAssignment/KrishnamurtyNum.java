package LoopAssignment;

import java.util.Scanner;

public class KrishnamurtyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = num.nextInt();
		int temp=n,r,sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("It's Krishnamurty Number");
		else
			System.out.println("It's NOT Krishnamurty Number");
		num.close();
	}

}
