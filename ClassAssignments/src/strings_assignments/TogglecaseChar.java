package strings_assignments;

public class TogglecaseChar {

	public static void main(String[] args) {
		String s="Hello World";
		String s1[]=s.split("\\s");
		String first;
		String afterF;
		String toggle="";
		for(int i=0;i<s1.length;i++)
		{
		first=s1[i].substring(0,1);
		afterF=s1[i].substring(1);
		toggle+=first.toLowerCase()+afterF.toUpperCase();
		}
		System.out.println(toggle);

	}

}
