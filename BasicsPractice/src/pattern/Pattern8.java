package pattern;

public class Pattern8 {
/*	********1*********
	*******2*2********
	******3*3*3*******
	*****4*4*4*4******
	****5*5*5*5*5*****		*/

	public static void main(String[] args) {
		int r=5;
		for(int i=1;i<=r;i++)
		{
			for(int k=r+3;k>=i;k--){
				System.out.print("*");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+"*");
			}
			for(int k=r+3;k>=i;k--){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
