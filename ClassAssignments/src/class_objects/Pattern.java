package class_objects;

public class Pattern {

	void starPattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(" *");
			System.out.println();
		}
	}
	void numPattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
					System.out.print(" 1");
				else
					System.out.print(" 0");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Pattern p=new Pattern();
		p.starPattern();
		p.numPattern();
	}

}
