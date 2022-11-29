package Containment;

public class PersonMain {

	public static void main(String[] args) {
		
		Address a1 = new Address(56001, "hadpasar", "pune", "Maharashtra");
		Address a2 = new Address(56041, "pimpri", "pune", "Maharashtra");
		Address a3 = new Address(56045, "Akurdi", "pune", "Maharashtra");
		
		Person1 p1 = new Person1(001, "mayur", "98556478", "sa@gmail.com", a1);
		Person1 p2 = new Person1(002, "Akhil", "95687878", "akhil@gmail.com", a2);
		Person1 p3 = new Person1(003, "Faruq", "956986478", "faruq@gmail.com", a3);
		
		System.out.println("----Person Details-----");
		System.out.println(p1);

		/*		System.out.println(a1);
		System.out.println("----Person Details-----");
		System.out.println(p2);
		System.out.println(a2);
		System.out.println("----Person Details-----");
		System.out.println(p3);
		System.out.println(a3);*/
	}

}
