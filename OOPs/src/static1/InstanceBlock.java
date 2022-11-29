package static1;

public class InstanceBlock {
	int id;
	String name;
	{
		System.out.println("Instance Block 1");
		id = 001;
		name = "faruq";
	}

	InstanceBlock() {
		System.out.println("Constructor called 1");
		id = 002;
	}

	void setData(int i, String s) {
		System.out.println("Method called 1");
		this.id = i;
		this.name = s;
	}

	void display() {
		System.out.println("Id: " + id + "name: " + name);
	}

	public static void main(String[] args) {
		InstanceBlock b = new InstanceBlock();
		b.setData(3, "atif");
		b.display();

	}

}
