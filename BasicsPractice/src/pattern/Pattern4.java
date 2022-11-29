package pattern;
   /* 1
	**2**
   ***3*** */
public class Pattern4 {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
			for(int k=3;k>i;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=(i-1)*2;j++)
			{
				if(j==i)
				{
					System.out.print(i);
				}
				System.out.print("*");
			}
			
			if(i==1)
				System.out.print(i);
			System.out.println();
		}

	}

}
