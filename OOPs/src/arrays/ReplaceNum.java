package arrays;

import java.util.Arrays;

public class ReplaceNum {

	public static void main(String[] args) {
		
		int a[]={10,-1,20,-2,30};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
			a[i]=0;
			a[i]=a[i+1]*a[i+1];//replace with next num square
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
