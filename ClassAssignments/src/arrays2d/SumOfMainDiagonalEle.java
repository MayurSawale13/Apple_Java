package arrays2d;

public class SumOfMainDiagonalEle {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 },{6,5,7}};
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
					sum+=a[i][j];
			}
		}
		System.out.println("Sumof Diagnola Elements is: "+sum);
	}

}
