package extra_prep;

public class Person {
	int age;
	String contact,name,address;
	Person(){
		
	}
	public void setData(String a,String name,String contact,int age){
		this.address=a;
		this.name=name;
		this.contact=contact;
		this.age=age;
	}
	void display(){
		System.out.println(age+" "+name+" "+contact+" "+address);
	}
}
