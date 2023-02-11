package com.apple.test1;

import java.util.Scanner;

/*. Write program to create fibbonaci number series. Print numbers upto 10000. [2m]
If number in series is divisible by 5 do not print that number .
0 ,1 ,1 ,2 ,3 (do not print 5),8,11,19,31,(do not print 50), 81*/
public class Q1 {
	void fib(int range) {
		int n1=0;
		int n2=1;
		int n3;
		for(int i=1;i<=range && n1<10000;i++){
			n3=n1+n2;
			if(n1%5!=0 || n1==0)
				System.out.print(n1+" ");
			n1=n2;
			n2=n3;
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range");
		int range=sc.nextInt();
		Q1 s=new Q1();
		s.fib(range);
	}
}
