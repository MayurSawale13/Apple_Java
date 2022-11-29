package constructor;

public class Chaining {

	Chaining() {// this() should be first statement
		// this(10,20); calling should not be recursive
		System.out.println("no-arg Constructor");
	}

	Chaining(int x) {

		this(10, 20, 30);
		System.out.println("1 parameter Constructor");
	}

	Chaining(int x, int y) {
		// this();
		System.out.println("2 parameter Constructor");
	}

	Chaining(int x, int y, int z) {
		this(10, 20);
		System.out.println("3 parameter Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chaining c = new Chaining(10);

	}

}
