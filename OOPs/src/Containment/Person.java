package Containment;

public class Person {
	int age;
	String pname,contact;
	IdProof id;
	Person(int age,String pname,String contact,IdProof id){
		this.age=age;
		this.pname=pname;
		this.contact=contact;
		this.id=id;
		
	}
	public String toString(){
		return "person Name:"+pname+" Age:"+age+" Contact:"+contact+"\nId proof details:"+id;
	}
}
