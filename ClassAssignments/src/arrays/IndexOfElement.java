package arrays;

import java.util.Scanner;

public class IndexOfElement {

	public static void main(String[] args) {
	 
		int a[]=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements of Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Element to find index");
		int num =sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
				System.out.println("index of element "+a[i]+"is:"+i);
		}
		sc.close();
	}

}
