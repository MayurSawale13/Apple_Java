package pattern;

public class Pattern2Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=4;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("second pattern");
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
