package arrays2d;

public class ScalarMultiplication {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 },
					  { 4, 5, 6 }, 
					  { 6, 5, 7 } };

		int constant=2;
		System.out.println("Matrix multiplied by"+constant);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=constant*a[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
