package strings_assignments;

public class RemoveEtxraSapces {

	public static void main(String[] args) {
		String s=" java   is  core  programming  ";
		String s1=s.replaceAll("\\s+", " ");
		System.out.println(s1);
		/*
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
				s1.
		}*/

	}

}
