package test9;

import java.util.Scanner;

public class DupliCharCount {
	void countDuplicate(char ch[]){
		int c[]=new int[ch.length];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter character to find count");
		char x=sc.next().charAt(0);
		int total=0;
		for(int i=0;i<ch.length;i++){
			c[i]=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[j]!='0'){
					c[i]++;
					ch[j]='0';
				}
			}
			if(c[i]>1)
				total++;
			
		}
		for(int i=0;i<c.length;i++){
			if(ch[i]==x && ch[i]!='0')
				System.out.print(ch[i]+"-"+c[i]);
		}
		System.out.println("\nTotal Duplicate element "+total);
	}

	public static void main(String[] args) {
		DupliCharCount d=new DupliCharCount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.next();
		char[] ch=s.toCharArray();
		d.countDuplicate(ch);
		sc.close();
	}

}
