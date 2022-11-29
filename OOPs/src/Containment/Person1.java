package Containment;

public class Person1 {
	int id;
	String name, contact, email;
	Address a;

	Person1(int id, String name, String contact, String email, Address a) {
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.a = a;
	}

	public String toString() {
		return "Person id:" + id + " Name:" + name + " contact:" + contact + " email:" + email+"ad:"+a;
	}

}
