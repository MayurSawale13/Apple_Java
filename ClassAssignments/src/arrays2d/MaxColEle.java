package arrays2d;

public class MaxColEle {

	public static void main(String[] args) {
		int a[][] = {{22, 31, 9}, {12, 25, 16}};
		
		for(int i=0;i<3;i++)
		{
			int max=0;
			for(int j=0;j<2;j++)
			{
			if(a[j][i]>max)
				max=a[j][i];
			}
			System.out.println("Max Element in "+(i+1)+" Column:"+max);
		}

	}

}
