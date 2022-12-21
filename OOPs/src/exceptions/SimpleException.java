package exceptions;

public class SimpleException {
	void add(int a,int b)
	{
		System.out.println("Addition:"+(a+b));
	}
	void sub(int a,int b)
	{
		System.out.println("Substraction:"+(a-b));
	}
	void multiply(int a,int b)
	{
		System.out.println("Multiplication:"+(a*b));
	}
	void divide(int a,int b)
	{
		System.out.println("Division:"+(a/b));
	}




	public static void main(String[] args) {
		int a=150,b=0;
		SimpleException s=new SimpleException();
		s.add(a, b);
		try
		{
		s.divide(a,b);
		}
		catch(Exception e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		s.sub(a, b);
		s.multiply(a, b);
		}

}
