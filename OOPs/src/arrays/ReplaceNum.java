package arrays;

import java.util.Arrays;

public class ReplaceNum {

	void replace(char a[],int n)
	{
		for(int i=0;i<n;i++)
		{	
			if(a[i]>='a' && a[i]<='z'){
				a[i]=((char)(a[i]-32));
			}
			else
				a[i]=((char)(a[i]+32));
		}
		System.out.println(Arrays.toString(a));
		
	}
	public static void main(String[] args) {
		int n=6;
		char ch[]={'a','A','b','B','c','C'};
		ReplaceNum r= new ReplaceNum();
		r.replace(ch, n);
	
	
		

	}

}
