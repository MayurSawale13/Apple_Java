package test4;
/*10. Class Person is as follows . Person { String name , int salary , String address } Create a
person object by using getter setter methods. Create clone of person object. [1m]*/

public class Q10 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1=new Person();
		p1.setName("ramesh");
		p1.setSalary(45000);
		p1.setAddress("hadapasar,pune");
		Person p2=(Person) p1.clone();
		System.out.println(p1);
		
		
		System.out.println(p2);
		p2.setName("mayur");
		System.out.println(p1);
		System.out.println(p2);
		

	}

}
