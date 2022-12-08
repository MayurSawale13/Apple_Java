package arrays;

import java.util.Scanner;

public class PrimeNumArray {

	void primeNum(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int mid=a[i]/2;
			int p=0;
			for(int j=2;j<=mid;j++)
			{
				if(a[i]%j==0)
				{
					p=1;
					break;
				}
			
			}
			if(p==0)
				System.out.print(a[i]);
			
		}
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
		 PrimeNumArray p=new PrimeNumArray();
		 p.primeNum(a);
		 sc.close();
		 
	}

}
