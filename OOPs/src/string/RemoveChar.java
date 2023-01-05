package string;


public class RemoveChar {

	public static void main(String[] args) {
		String s="abcabbcaababcabbbcaab";
		char ch[]=s.toCharArray();
		String s1="";
		int len=ch.length;
		
		for(int i=0;i<len;i++) {
			if(i==len-1 ||i==len-2) {
				s1=s1+ch[i];
			}else {
				if(ch[i]=='b'&&ch[i+1]=='c'&&ch[i+2]=='a') {
					i=i+2;
				}else {
					s1=s1+ch[i];
				}
			}
		}
		
		System.out.println(s1);
		
		
	
		
		

	}

}
/* package writtenString08;

import java.util.Arrays;
import java.util.Scanner;

public class StringOccurence04 {

	public static void main(String[] args) {
		String str="Java Language. java session core java session";
		String word="java";
		
		String s1[]=str.split(" ");
		System.out.println(Arrays.toString(s1));
	
		String s="";
		
//		for(int i=0;i<s1.length;i++) {
//			if(!s1[i].equalsIgnoreCase(word)) {
//				s=s+s1[i]+" ";
//			}
//		}
//		System.out.println(s);
		
		String str1[]=new String[s1.length];
		int j=0;
		for(int i=0;i<s1.length;i++) {
			if(!s1[i].equalsIgnoreCase(word)) {
				str1[j]=s1[i];
				j++;
			}
		}
		
		for(String st:str1) {
			if(st!=null) {
				System.out.print(st+" ");
			}
		}
		

	}

}
*/