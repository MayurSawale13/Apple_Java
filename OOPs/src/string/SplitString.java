package string;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		String s="Hello@World";
		
		String s1[]=s.split("@");
		System.out.println(Arrays.toString(s1));
		String s2="abbcabbabcaab";
		char[] c=s2.toCharArray();
	}
}