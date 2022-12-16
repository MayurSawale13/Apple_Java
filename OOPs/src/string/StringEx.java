package string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		String s="java is a good programming language";
		System.out.println(s.indexOf('g',13));
		System.out.println(s.indexOf('g', 10));
		System.out.println(s.lastIndexOf('g'));
		System.out.println(s.replace('i', 'f'));
		
		String str[]=s.split(" ");
		
		System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++)
		{
			for(int j=str[i].length()-1;j>=0;j--)
			{
				System.out.print(str[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
