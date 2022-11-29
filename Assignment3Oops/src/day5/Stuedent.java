package day5;

public class Stuedent extends College  {
	int sid;
	String sname;
	Stuedent(){
		super(4,"pes");
	}
	public void sDetails()
	{
		sid=54;
		sname="Mayur";
	}
	public void sdisplay()
	{	
		//udisplay();
		display();
		System.out.println("Student id: "+sid+"\nStudent name: "+sname);
	}
	public static void main(String[] args) {
		//University u=new University();
		//College c=new College();
		Stuedent s=new Stuedent();
		//s.getDetails();
		
		//s.detalis();
		
		s.sDetails();
		s.sdisplay();
	}

}
