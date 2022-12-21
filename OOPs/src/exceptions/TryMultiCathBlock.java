package exceptions;

public class TryMultiCathBlock {

	public static void main(String[] args) {
		int a=10,b=0;
		int arr[]={10,6,0,40,80};
		String s="India";
		String c=null;
		try{
			System.out.println("Division:"+a);
			System.out.println(arr[3]);
			System.out.println(s.charAt(3));
			System.out.println(c.length());//java default exception handler ie Exception e
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Done");
		System.out.println("Multi catch executed");

	}

}
