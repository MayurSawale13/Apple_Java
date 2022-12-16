package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	String a="hello";
	String b="elloh";
	if(a.length()==b.length())
	{
		char c[]=a.toCharArray();
	
		char d[]=b.toCharArray();
		/*Arrays.sort(c);
		Arrays.sort(d);*/
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length-1;j++)
			{
				if(c[j]>c[j+1])
				{
					char temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length-1;j++)
			{
				if(d[j]>d[j+1])
				{
					char temp=d[j];
					d[j]=d[j+1];
					d[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=d[i])
			{
				count++;
			}
		}
		if(count==c.length)
			System.out.println("anagram");
		else
			System.out.println("not anagram");
	}

	}

}
