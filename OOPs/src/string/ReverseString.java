package string;

public class ReverseString {

	public static void main(String[] args) {
		/*String s="java is a good programming language";
		System.out.println(s);
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}*/
		String s1="java5isa6good7";// programming language";
		//System.out.print(s1.charAt(0));
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0'&& s1.charAt(i)<='9' ){
				System.out.print(s1.charAt(i)+" ");
				sum=sum+s1.charAt(i);
			}
			}
		System.out.println("\nSum:"+sum);
		
	}

}
