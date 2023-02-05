package string;

public class FirstAplha {

	public static void main(String[] args) {
	String s="hi";
	String s1="Hello";
	String s2="how";
	System.out.println(s.charAt(0)+" "+s1.charAt(0)+" "+s2.charAt(0));
	
	/*for(int i=0;i<s1.length();i++)
	{
		if(i==0)
			continue;
		else if(i<s.length())
			System.out.print(s.charAt(i));
		else if(i<s1.length())
			System.out.print(s1.charAt(i));
		else if(i<s2.length())	
		    System.out.print(s2.charAt(i));
			
	}*/
	
	for(int i=0;i<s.length();i++)
	{
		if (i==0)	
		  continue;
		else
		 System.out.print(s.charAt(i));
	}
	for(int i=0;i<s1.length();i++)
	{
		if (i==0)	
		  continue;
		else
		 System.out.print(s1.charAt(i));
	}
	for(int i=0;i<s2.length();i++)
	{
		if (i==0)	
		  continue;
		else
		 System.out.print(s2.charAt(i));
	}
	}

}
