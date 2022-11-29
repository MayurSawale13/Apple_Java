package pattern;

public class Pattern23 {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i;k<5-i;k++)
			{
				System.out.print(" ");
			}
			
			
			for(int h=i;h>=1;h--)
			{
				if(h==3)
					continue;
				int g=6;
				System.out.print(g-h);
				g--;
			}
			System.out.println();
		}

	}

}
