package pattern;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=64;
		for(int i=1;i<=6;i++)
		{
			for (int k=1;k<=i-1;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=6-i;j++)
			{
				System.out.print((char)(j+c));
			}
			System.out.println();
		}

	}

}
