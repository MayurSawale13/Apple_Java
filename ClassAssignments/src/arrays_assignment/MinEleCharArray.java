package arrays_assignment;

import java.util.Arrays;

public class MinEleCharArray {
	public static void main(String[] args) {
		
		char ch [] ={'A','D','E','x','z','R'};
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
		System.out.println(Arrays.toString(ch));
		System.out.println("Minimum element of array is: "+ch[0]);
		
	}

}
