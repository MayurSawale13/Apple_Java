package interfacepack;

interface A {
	int a = 3, b = 5;

	void add(int a);

	void sqrt(int a);

	default void sub()// no need for implement logic in child class.but we can
						// override if needed
	{
		System.out.println("Subtraction :" + (b - a));
	}
}

interface B {
	void multip(int a, int b);

	void sqrt(int a);
}

class C implements A, B {
	public void add(int a) {
		System.out.println("Addtion implementation:" + (a + a));
	}

	public void multip(int a, int b) {
		System.out.println("multiplication implementation:" + (a * b));
	}

	public void sqrt(int a) {
		System.out.println("Sqrt implementation:" + Math.sqrt(a));
	}
}

public class MultipleInteface {
	public static void main(String[] args) {
		C c1 = new C();
		c1.add(5);
		c1.multip(2, 5);
		c1.sqrt(25);// no ambiguity because implementation is done in child
					// class.
		c1.sub();
	}

}
