package pattern;

public class Pattern7 {
/*	*******
	*     *
	*     *
	*     *
	*     *
	*******		*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++)
		{	
			
			for(int j=1;j<=6;j++)
			{
				if(i==1|| j==1||i==6)
				{
					System.out.print("*");
				}
			}
			for(int k=2;k<=6;k++)
			{
				if(i==1|| i==6)
					continue;
				System.out.print(" ");
			}
			for(int j=1;j<=6;j++)
			{
				if(j==6)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
