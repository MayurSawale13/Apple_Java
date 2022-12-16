package arrays2d;

public class Transpose {

	public static void main(String[] args) {
	int r=2,c=3;
	int a[][]={{1,2,3},{4,5,6}};
	int b[][]=new int[c][r];

	
for(int i=0;i<2;i++)
{
	for(int j=0;j<3;j++)
	{
	System.out.print(a[i][j]);
	}
	System.out.println();
}
for(int i=0;i<3;i++)
{
	for(int j=0;j<2;j++)
	{
		b[i][j]=a[j][i];
		System.out.print(b[i][j]);
	}
	System.out.println();
}
	}

}
