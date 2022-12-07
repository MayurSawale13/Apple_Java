package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter Elements of Array ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Elements of Array:");
		for(int i=0;i<size;i++)
		{
			if(a[i]%2==0)
			System.out.print(a[i]+" ");
		}
		/*
			System.out.println(Arrays.toString(a));
		}*/
		
		

	}

}
