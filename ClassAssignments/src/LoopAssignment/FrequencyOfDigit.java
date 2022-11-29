package LoopAssignment;

import java.util.Scanner;

public class FrequencyOfDigit {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter a Number ");
		int n=num.nextInt();
		System.out.println("Enter a dight from Number:");
		int d=num.nextInt();
		int freq=0,temp=n;
		while(n>0)
		{
			if(n%10==d)
			{
				freq++;
			}
			n=n/10;
		}
		System.out.println("Frequncy of "+d+" in "+temp+" is:"+freq);
		num.close();

	}

}
