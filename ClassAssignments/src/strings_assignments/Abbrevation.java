package strings_assignments;

public class Abbrevation {

	public static void main(String[] args) {
		String name="Mayur Devrao Sawale";
		String s1[]=name.split("\\s");
		String Abbrev="";
	
		Abbrev=	s1[0].charAt(0)+" "+s1[1].charAt(0)+" "+s1[2];
		System.out.println(Abbrev);

	}

}
