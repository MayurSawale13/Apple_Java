package string;

public class Palindrome {

	public static void main(String[] args) {
		String s="abba";
		char ch[]=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			ch[i]=s.charAt(i);
		}
		int count=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(ch[i]==s.charAt(i)){
				count++;
			}
			
			
		}
		if(count==s.length())
		{
			System.out.println("pa");
		}
	}

}
