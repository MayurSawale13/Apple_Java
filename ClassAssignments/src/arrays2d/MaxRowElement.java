package arrays2d;

//import java.util.Arrays;

public class MaxRowElement {

	public static void main(String[] args) {
		int a[][] = {{22, 31, 9}, {12, 25, 16}};
		//int row=2,c=3;
		for(int i=0;i<2;i++)
		{
			int max=0;
			for(int j=0;j<3;j++)
			{
			if(a[i][j]>max)
				max=a[i][j];
			}
			System.out.println("Max Element in "+(i+1)+" row:"+max);
		}
		
	}

}
