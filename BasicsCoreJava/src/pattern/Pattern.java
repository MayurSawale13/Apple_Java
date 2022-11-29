package pattern;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=4;
		for(int i=1;i<=rows;i++)	//i=1 		i=2 	 i=3 		 i=4
		{
			for(int j=1;j<=i;j++)	//j=1	j=1 j=2   j=1 j=2 j=3   ... j=4
			{										
				System.out.print("*");		//*
			}								//**
			System.out.println();//nextline	//***
		}									//****
		
		System.out.println("------Downward Pattern------");
		
		for (int i=rows;i>=1;i--)
		{
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		System.out.println();
		}
	}

}
