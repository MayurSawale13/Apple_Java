package exceptions;

public class NestedTry {

	public static void main(String[] args) {
		int a=10,b=0;
		int arr[]={10,6,0,40,80};
		String s="India";
		String c=null;
		//1.try statemnt should be  last of stmt of inner try block
		//2.inner catch not extcuted for outer try 
		//but outer catch block can be executed for inner try
		try
		{
			try
			{
				try
				{
					try
					{
						System.out.println("Division:"+a/b);
					}
					catch(ArithmeticException e)
					{
						System.out.println(e);
					}
					
					System.out.println(arr[6]);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println(e);
				}
				
				
				System.out.println(s.charAt(6));
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			System.out.println(c.length()+1);
		}
		catch(Exception e)//java default exception handler ie Exception e
		{
			System.out.println(e);
		}
			
			
		System.out.println("Done");
		System.out.println("Multi catch executed");	
			
		}
		
	
		
		
		


	}

//}}
