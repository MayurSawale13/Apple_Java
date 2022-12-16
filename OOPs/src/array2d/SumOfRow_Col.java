package array2d;

public class SumOfRow_Col {

	public static void main(String[] args) {
		int b[][]={{3,4,5},{8,9,10}};
		
		for(int i=0;i<2;i++)
		{
			int sumr=0;
			for(int j=0;j<3;j++)
			{
				sumr +=b[i][j];
			}
				System.out.println("Sum of "+(i+1)+" row:"+sumr);	
			}
		//Sum Of columns reverse iterate
		for(int i=0;i<3;i++)
		{
			int sumc=0;
			for(int j=0;j<2;j++)
			{
				sumc +=b[j][i];
			}
				System.out.println("Sum of "+(i+1)+" column:"+sumc);	
			}
			}
	}


