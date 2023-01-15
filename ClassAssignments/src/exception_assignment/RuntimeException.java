package exception_assignment;

public class RuntimeException   {
	void display(int a[])
	{
		int i=5;
		if(i>a.length)
			throw new ArrayIndexOutOfBoundsException ();
	}
	public static void main(String[] args) {
		int a[]={0,1,2,3};
		RuntimeException r=new RuntimeException();
		try{
		r.display(a);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter index<size");
		}
	}

}
