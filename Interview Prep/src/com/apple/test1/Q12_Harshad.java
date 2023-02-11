package com.apple.test1;

import java.util.Scanner;

/*12. Write a program to find out given number is ‘Harshad’ number or not. A number is called
Harshad number if it is divisible by sum of its digit. [1m]
e.g. 200 is harshad number : 2+0+0 = 2 . 200 is divisible by 2*/
public class Q12_Harshad {
	void checkNum(int num){
		int temp=num;
		int sum=0;
		while(temp>0){
			int r=temp%10;
			sum+=r;
			temp=temp/10;
		}
		if(num%sum==0)
			System.out.println("it's harshad number");
		else 
			System.out.println("it's not harsahd number");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		Q12_Harshad h=new Q12_Harshad();
		h.checkNum(num);

	}

}
