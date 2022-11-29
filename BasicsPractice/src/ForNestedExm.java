
public class ForNestedExm {

	public static void main(String[] args) {
	
		
		/*//Number Table Using For
		int num = 3;
		for (int i = 1; i <= 10; i++)
		// for is faster tham while ..uses processor registry mem.

		{
			if (i == 5)
				continue; // To skip specific Iteration
			if (i == 10)
				break; // to take control out of LOOP
			System.out.println(num * i);

		}
*/		
		//Nested For Loop	1. PatternPrinting
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
*/
	
	//Nested For Loop 2.ReversePattern
			for(int i=1;i<=5;i++)
			{
				for(int j=5;j>=i;j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}

		}

}
