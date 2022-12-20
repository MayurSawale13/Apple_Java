package string;

import java.util.Arrays;

public class CharIndexOrder {

	public static void main(String[] args) {
		String s="thequickbrownfoxjumpsoverlazydog";
		char ch[]=s.toCharArray();
		char ch1[]=ch;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length-i-1;j++)
			{
				if(ch[j]>ch[j+1])
				{
				char temp=ch[j];
				ch[j]=ch[j+1];
				ch[j+1]=temp;
			}
			}
			
			
		}
		for(int i=0;i<ch1.length;i++)
			if(ch1[i]==(ch[i]))
			{
				System.out.print(ch1[i]);
			}
	}

}
