package test9;

public class Palindrome {

	public static void main(String[] args) {
		String s="vithamas";
		char[] ch=new char[s.length()];
		int c=0;
		for(int i=s.length();i>0;i--){
		ch[i]=s.charAt(i);	
		}
		for(int i=0;i<ch.length;i++){
			if(ch[i]==s.charAt(i))
				c++;
		}
		if(c==s.length())
			System.out.println("Palindrome");
		else
			System.out.println("not Palindrome");

	}

}
