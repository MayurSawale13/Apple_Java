package test4;

public class Q13 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Country c=new Country(1,"India");
		Person1 p1=new Person1(106,"Akhil",c);
		
		Person1 p2=(Person1)p1.clone();
		System.out.println(p1);
		System.out.println(p2);
		p2.c.name="USA";
		System.out.println("p1: "+p1);
		System.out.println("p2: "+p2);

	}

}
