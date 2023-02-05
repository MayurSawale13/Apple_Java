package arrays_extra_assignment;

import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {
		String s1=""; //0					1		2		
		String s[]={"lionel messi","di maria","paulo dybala"};
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
			int flag=0;
			char [] x=s[i].toCharArray();
			for(int j=0;j<x.length;j++)
			{
				
				if (x[j]=='a' || x[j]=='e'||x[j]=='i'){
					flag=1;
				}
			}
			if (flag==1){
				System.out.println(s[i]);
			}
		}

	}

}
