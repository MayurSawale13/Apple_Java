package arrays2d;

public class SumOfRow_Col {

	public static void main(String[] args) {
		int b[][] = { { 3, 4, 5 }, { 2, 3, 4 } };
		
		for(int i=0;i<2;i++)
		{	int sum=0;
			for(int j=0;j<3;j++)
			{
				sum+=b[i][j];
			}
			System.out.println("Sum of Row "+(i+1)+"="+sum);
		}
		for(int i=0;i<3;i++)
		{	int sum=0;
			for(int j=0;j<2;j++)
			{
				sum+=b[j][i];
			}
			System.out.println("Sum of column "+(i+1)+" = "+sum);
		}

	}

}
