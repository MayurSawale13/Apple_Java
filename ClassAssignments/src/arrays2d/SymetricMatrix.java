package arrays2d;

import java.util.Arrays;

public class SymetricMatrix {

	public static void main(String[] args) {
		int r=3,c=3;
		int a[][] = { { 1, 1, 1 },
				  { 1, 1, 1 }, 
				  { 1, 1, 1 } };
		int b[][]=new int[c][r];
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				b[i][j]=a[j][i];
				System.out.print(b[i][j]+" ");
			}
		System.out.println();
		}
		int flag=1;
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				if(a[i][j]!=b[i][j])
				{	
					flag=0;
					break;
				}
			}
		}
		if(flag==1)
			System.out.println("Symetric Matrix");
		else
			System.out.println("Not Symetric Matrix");

	}

}
