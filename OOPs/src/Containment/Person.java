package Containment;

public class Person {
	int id;
	String pname,contact;
	IdProof id1;
	Person(int age,String pname,String contact,IdProof id){
		this.id=age;
		this.pname=pname;
		this.contact=contact;
		this.id1=id;
		
	}
	public String toString(){
		return "person Name:"+pname+" Id:"+id+" Contact:"+contact+"\nId proof details:"+id;
	}
}
