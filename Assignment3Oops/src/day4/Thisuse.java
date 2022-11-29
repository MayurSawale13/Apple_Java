package day4;

public class Thisuse {

	// Uses:
	// 1.to call current object
	// 2.to avoid variable shadowing
	// 3.to achieve object chaining i.e calling one object to another

	int id;
	String name;

	// 1.Default constructor:object initialized at the time of creation.
	Thisuse() {

		this(4, "vijay");
		System.out.println("calling another object using this");

		id = 1;
		name = "sundar";

	}

	// parameter :depends upon order and number of parameter is called
	Thisuse(int id, String name) {
		System.out.println("this is used to avoid shadowing");
		this.id = id;
		this.name = name;

		this.disply();
	}

	Thisuse(String name, int id) {
		// System.out.println("this is used to avoid shadowing");
		this.id = id;
		this.name = name;

	}

	void disply() {
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		Thisuse c = new Thisuse();
		Thisuse c1 = new Thisuse(2, "leela");
		Thisuse c2 = new Thisuse("mayur", 3);
		 c.disply();
		c1.disply();
		c2.disply();

	}

}
