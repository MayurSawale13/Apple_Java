

 class B{
	
	private int value1;
	public int getValue1()
	{
		return value1;
	}
	public void setValue1(int value1)
	{
		this.value1=value1;
	}
	
}
public class Encapsule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.setValue1(15);
		System.out.println("The value is"+obj.getValue1());
		

	}

}
