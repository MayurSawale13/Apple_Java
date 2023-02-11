package test4;
/*9. Write a program to create a array with dimensions nXm .
 *  Accept n and m from user. Accept
array values from user . Also display them. [1m]*/

import java.util.Scanner;

public class Q9 {
	
	void createArray(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dimensions nxm(rows x columns)");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display matrix");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Q9 arr=new Q9();
		arr.createArray();

	}

}
