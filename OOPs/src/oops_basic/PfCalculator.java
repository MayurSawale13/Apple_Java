package oops_basic;

import java.util.Scanner;

public class PfCalculator {
	void pf(float a)
	{	
		
		System.out.println("pf is: "+(a*0.15));
	}
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter salary");
		float a=n.nextFloat();
		PfCalculator p=new PfCalculator();
		p.pf(a);
		n.close();
	}

}
