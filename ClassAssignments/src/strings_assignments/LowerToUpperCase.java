package strings_assignments;

public class LowerToUpperCase {

	public static void main(String[] args) {
		String s="the india";
		
		//without uppercase method:
		char [] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
			System.out.print((char)(c[i]-32));
		
		//using uppercase:
		System.out.println("\n"+""+s.toUpperCase());
		
	}

}
