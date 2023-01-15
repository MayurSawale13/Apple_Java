package strings;

import java.util.Arrays;

public class ArrayDuplicate {

	public static void main(String[] args) {
		String s[]={"a","java","core","java","core","sesseion","java"};
		String s1[]=new String [s.length];
		/*for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
			
			if(!s1[i].contains(s[i]))
				{
				
					s1[i]=s[i];
				
				}
		}
				
		
		}*/
		for(String x:s)
		{
			for(String a:s)
			{
				if(a.equals(x))
				{
					System.out.println(a);
				}
			}
		}
		System.out.println(Arrays.toString(s1));
	}

}
