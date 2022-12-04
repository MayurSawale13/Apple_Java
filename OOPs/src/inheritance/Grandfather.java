package inheritance;

class Grandfather {
	String fn, mn;
	static String ln = "sawale";

	public void setFn(String fn) {
		this.fn = fn;
	}

	public void setMn(String mn) {
		this.mn = mn;
	}

	public String getmn() {
		return mn;
	}

	void display() {

		System.out.println("Grand Father Details:" + fn + " " + mn + " " + Grandfather.ln);
	}
}

class Father extends Grandfather {

	String fn1;

	public void setFn1(String fn) {
		this.fn1 = fn;
	}

	void display() {
		super.display();
		System.out.println("Father Details:" + fn1 + "" + super.fn + "" + Grandfather.ln);
	}
}

class Child extends Father {

	String fn2;

	public void setFn2(String fn) {
		this.fn2 = fn;
	}

	void display() {
		//super.display();
		//System.out.println("Child Details:" + fn2 + " " + super.fn1 + " " + Grandfather.ln);
	}

}
