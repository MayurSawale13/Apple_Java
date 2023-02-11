package com.apple.test1;
/*14. Write a program to accept int number from user. Print nth power of input number. n is size
of number.
e.g. input 25 ans 252 size of 25 Is 2
input 121 ans 1771561 ( 121 * 121 * 121 )*/
import java.util.Scanner;

public class Q14_PowerofNum {
	void power(int n,int p){
		int power=1;
		for(int i=0;i<p;i++){
			power*=n;
		}
		System.out.println(n+" power to "+p+" : "+power);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num and exponent");
		int num=sc.nextInt();
		int p=sc.nextInt();
		Q14_PowerofNum m=new Q14_PowerofNum();
		m.power(num, p);
		
	}

}
