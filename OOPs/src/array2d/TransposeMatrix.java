package array2d;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		int r=2,c=3;
		int a[][]=new int [r][c];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values for array:");
		for(int i=0;i<r-1;i++)
		{
			for(int j=0;j<c-1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int b[][]=new int[c][r];
		for(int i=0;i<c-1;i++)
		{
			for(int j=0;j<r-1;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println(b[i][j]);
			}
			System.out.println();
		}

	}

}
