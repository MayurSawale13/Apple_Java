package interfacepack;

public class SimpleCal implements Calculator {

	
	public void addtion(int a,int b) {
	System.out.println("Addiotion:"+(a+b));
		
	}

	
	public void substraction(int a,int b) {
		System.out.println("Substraction:"+(b-a));
		
	}

	
	public void multi(int a,int b) {
		System.out.println("Multiplication:"+(a*b));
		
	}

	public void division(int a,int b) {
		System.out.println("Division:"+(b/a));
		
	}

}
