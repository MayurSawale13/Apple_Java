package string;

import java.util.Arrays;

public class ReplaceChar {

	public static void main(String[] args) {
		String s="language is good so is life";
		String [] s2=s.split(" ");
		System.out.println(s);
		String s1="";
		for(int i=0;i<s2.length;i++)
		{
			if(!s2[i].equalsIgnoreCase("is")){
				 s1=s1+s2[i]+" ";
			
				 }
		}
		
		System.out.println(s1);
		
			
		
	}

}
