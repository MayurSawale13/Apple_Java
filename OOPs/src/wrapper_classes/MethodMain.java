package wrapper_classes;

public class MethodMain {
	/*void display(float a)
	{
		System.out.println("float display ");
		
	}*/
	/*void display(int a)
	{
		System.out.println("int display ");
		
	}*/
	/*void display(Integer a)
	{
		System.out.println("Integer display ");
		
	}*/
	void display(Float a)
	{
		System.out.println("Float display ");
		
	}
	void display(Number a)
	{
		System.out.println("Number display ");
		
	}
	public static void main(String[] args) {
		
		MethodMain mn=new MethodMain();
		mn.display(100);
		mn.display(100.5f);
		mn.display(110);
		
	}

}
