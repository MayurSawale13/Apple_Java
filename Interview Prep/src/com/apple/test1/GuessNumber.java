package com.apple.test1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int fixedNum=r.nextInt(50);
		
		System.out.println("Enter number to guess");
		int num=sc.nextInt();
		while (num!=fixedNum)
		if(num<fixedNum){
			System.out.println("number is less than fixednum, enter greater number");
			 num=sc.nextInt();
		}
		else if (num>fixedNum){
			System.out.println("number is greater than fixed number ,enter lesser num");
			num=sc.nextInt();
		}
		System.out.println("guessed right number,number is "+fixedNum);
		
		}
}
