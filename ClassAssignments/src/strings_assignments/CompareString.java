package strings_assignments;

public class CompareString {

	public static void main(String[] args) {
		String s=new String("java language");
		System.out.println(s);

		String s1=new String("java language");
		if(s==s1)//s1.equals(s) compare using string object.
			System.out.println("equal");
		else
			System.out.println("Not equal");
		if(s.equals(s1))//compare using object
			System.out.println("Equal object");
		else
			System.out.println("not Equal using object");
		String a="java language";
		String b="java language";
		if(a==b)//compare using string referance
			System.out.println("equal");
		else
			System.out.println("Not equal");
	

	}

}
