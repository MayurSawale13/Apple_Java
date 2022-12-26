package strings_assignments;

import java.util.Arrays;

public class UpperToLowerCase {

	public static void main(String[] args) {
		String s1="THE INDIA IS A GREAT COUNTRY";
//WIthout Lower case method:
		char ch[]=new char[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
				ch[i]=' ';
			else
			ch[i]=(char)(s1.charAt(i)+32);
		}
		String s=new String(ch);
		System.out.println(s);
		
		//With Upper Case:
		String sh=s1.toLowerCase();
		System.out.println(sh);
	}

}
