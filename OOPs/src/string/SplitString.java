package string;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		String s="Hello_World";
		
		String s1[]=s.split("_");
		System.out.println(Arrays.toString(s1));
		
	}
}