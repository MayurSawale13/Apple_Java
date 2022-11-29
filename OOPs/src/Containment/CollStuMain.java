package Containment;

public class CollStuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(); 
		//Aggregation :delete one object not affect exeistance of other
		//Composition:viceversa
		s1.setId(1);
		s1.setSname("Akhil");
		
		Depart d1=new Depart();
		d1.setDeptid(002);
		d1.setDeptname("Civil");
		
		College c1=new College();
		c1.setCode(225);
		c1.setName("REC");
		c1.setAddy("pune");
		c1.setDepart(d1);
		c1.setStudent(s1);
		
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(s1);
	}

}
