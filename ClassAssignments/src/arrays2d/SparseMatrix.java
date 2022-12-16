package arrays2d;

public class SparseMatrix {

	public static void main(String[] args) {
		int a[][] = { { 0, 2,0  },
					  { 0, 0, 6 }, 
					  { 6, 0, 0 } };

	int countz=0,countn=0;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(a[i][j]==0)
				countz++;
			else
				countn++;
		}
	}
	if(countz>countn)
		System.out.println("It is a sparse Matrix");
	else
		System.out.println("It is not Sparse Mtrix");
	}
	

}
