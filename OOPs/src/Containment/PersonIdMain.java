package Containment;

public class PersonIdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdProof id1=new IdProof(0465,"Adhar","Hadapasar,pune");
		
		Person p=new Person(26,"Akhil","98653214",id1);
		System.out.println(p);
	}

}
