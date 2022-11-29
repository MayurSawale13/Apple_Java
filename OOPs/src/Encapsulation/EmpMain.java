package Encapsulation;

public class EmpMain {

	public static void main(String[] args) {
		Employe e1= new Employe();
		e1.setId(1);
		e1.setName("mayur");
		//System.out.println("Emp Id: "+e1.getId()+"\nEmp Name: "+e1.getName());
		e1.display();
		Employe e2= new Employe(2,"mar");
		e2.display();
	
	}

}
