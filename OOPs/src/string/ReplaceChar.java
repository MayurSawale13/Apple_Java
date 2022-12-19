package string;

import java.util.Arrays;

public class ReplaceChar {

	public static void main(String[] args) {
		String s="language is good so is life";
		String [] s2=s.split(" ");
		System.out.println(s.replace('g', 'a'));
		
	
		
		
		System.out.println(s);
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i].contains("is")){
				 s2[i]=" was ";
			
				 }
		}
		
		System.out.println(Arrays.toString(s2));
		
			
		
	}

}
