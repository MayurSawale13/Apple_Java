package strings;

public class ConverCase {

	public static void main(String[] args) {
	String s="AmaZon";
	char s1[]=s.toCharArray();
	String output="";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(Character.isUpperCase(ch))
				{
			output+=Character.toLowerCase(ch);
		}
		if(Character.isLowerCase(ch))
		{
			output+=Character.toUpperCase(ch);
}
		
	}
	
	System.out.println(output);
	}

}
