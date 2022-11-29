package static1;

public class PuneCollege {
	int id,dno;
	String sname,loc;
	static String state="Maharashtra";
	//Cannot declare static inside methods but can access inside method
	static String uni_name="Pune University";
	PuneCollege(){
		id=1;
		dno=1;
		sname="D Y Patil";
		loc="pimpri,pune";
	}
	static void changeState(String s)
	{
		state=s;
		System.out.println(state);
	}
	void disply()
	{
		System.out.println("College ID: "+id);
		System.out.println("College name: "+sname);
		System.out.println("College Dept number: "+dno);
		System.out.println("College Location: "+loc);
		System.out.println("University Name: "+PuneCollege.uni_name);
		System.out.println("State: "+PuneCollege.state);
	}
	public static void main(String[] args) {
		PuneCollege.changeState("Andhra Pradesh");
		/*PuneCollege p=new PuneCollege();
		p.disply();*/
		
	}

}
