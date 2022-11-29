
public class Pattern {

	public static void main(String[] args) {
		
		/*1 2 3 4 5
		  2 3 4 5
		  3 4 5
		   4 5
		    5
		   4 5
		  3 4 5
		 2 3 4 5
		1 2 3 4 5*/
		
		int alpha=64;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<(i);j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print((char)(k+alpha)+" ");
			}
			System.out.println();
		}
		for(int i=5-1;i>=1;i--)
		{
			for(int k=i;k>=2;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++)
			{
				System.out.print((char)(j+alpha)+" ");
			}
			System.out.println();
		}

	
		
	}

}
