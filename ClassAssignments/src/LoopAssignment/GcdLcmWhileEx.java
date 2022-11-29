package LoopAssignment;

import java.util.Scanner;

public class GcdLcmWhileEx {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter Two Numbers to find GCD And lcm");
		int n1=num.nextInt();
		int n2=num.nextInt();
		int i=n1,j=n2;
		while(n1!=n2)
		{
			if(n1>n2)
				n1=n1-n2;
			else
				n2=n2-n1;
		}
		System.out.println("GCD of " +i+ "and "+j+ "= " +n1 );
		int lcm=(i*j)/n1;
		System.out.println("LCm of " +i+ "and "+ j+ "= "+lcm);
		num.close();
		
	}

}
