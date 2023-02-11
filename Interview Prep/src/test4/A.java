package test4;

abstract class A {
	static String s = "1";

	A() {
		s += "2";
	}
}

class Output extends A {
	Output() {
		this(7);
		s += "3";
	}

	Output(int x) {
		s += "4";
	}

	public static void main(String[] args) {
		System.out.print("east " + s + " ");
	}

	static {
		Output e = new Output();
		System.out.print("west " + s + " ");
	}
}
