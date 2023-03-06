package arrays_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Max2ndElement {
	int min=Integer.MAX_VALUE;
     void secondHighest(int a[]){
    	 for(int i=0;i<a.length;i++)
 		{
 			for(int j=0;j<a.length-1;j++)
 			{
 				if(a[j]<a[j+1])
 				{
 					int temp=a[j];
 					 a[j]=a[j+1];
 					 a[j+1]=temp;
 				}
 			}
 		}
 		System.out.println("Second Highest Number is: "+a[1]);
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		//int a[]={-20, 0, -25, 15, 19, 37, 23};
		
		Max2ndElement m=new Max2ndElement();
			
		m.secondHighest(a);
		//System.out.println(Arrays.toString(a));
	}
}
