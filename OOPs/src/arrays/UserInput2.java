package arrays;

import java.util.Scanner;

public class UserInput2 {

	void arrayDisplay(int a[])
	{
		for(int i=0;i<a.length;i+=2)
		{
			System.out.print(a[i]+" ");
		}
	}
	void searchArray(int a[],int element)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
				System.out.print("\nat index:"+i);
			else
				count++;
		}
		if(count==a.length)
			System.out.println("element not found");
	}
	public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter size of arrray");
	 int size=sc.nextInt();
	 int a[]=new int[size];
	 System.out.println("Enter array elements:");
	 for(int i=0;i<size;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 UserInput2 c=new UserInput2();
	 c.arrayDisplay(a);
	 c.searchArray(a, 35);
		

	}

}
