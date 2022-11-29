package pattern;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=4;
		for(int i=1;i<=rows;i++)
		{
			for(int k=1;k<=rows-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
			System.out.print("* ");
			}
			System.out.println();
		}
	}

}
