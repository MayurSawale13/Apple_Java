package test4;

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
	void delete(int a[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to delete");
		int x=sc.nextInt();
		int b[]=new int[a.length-1];
		int k=0;
		for(int i=0;i<a.length;i++){
			
			if(a[i]!=x){
				b[k]=a[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Array after removing "+x+" :");
		System.out.println(Arrays.toString(b));
		
	}

	public static void main(String[] args) {
		int a[]={4,2,5,7,8,2,9};
		Q7 d=new Q7();
		d.delete(a);
		

	}

}
