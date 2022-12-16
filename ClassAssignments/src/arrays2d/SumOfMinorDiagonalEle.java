package arrays2d;

public class SumOfMinorDiagonalEle {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, 
					{   4, 5, 6 },
					{   6, 5, 7}};
		int sum=0;
		int row=3;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				if(j==(row-i-1))
					sum+=a[i][j];
			}
		}
		System.out.println("Sum Of Minor Elements :"+sum);
	}

}
