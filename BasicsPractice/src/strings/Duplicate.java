package strings;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
		
		int a[]={10,20,30,40,50,10,20,10,20,60};
		int a1[]=new int[a.length]; 
		Arrays.sort(a);
		
		//int index=0;
		for(int i=0;i<a.length;i++)
		{ 
			/*int j=1;
			
			for( j=0;j<i;j++)
			{
				
				if(a[i]==a[j] ){
					break;
				}
			}
				if(j==i)
				{
					a[index++]=a[i];
				}
			*/
					
			int count=1;
			
			if(count==1 && a[i]!=0 )
			{
				//a1[i]=a[i];
				System.out.print(a[i]+" ");
			}
			else
				count++;
	}
System.out.println(Arrays.toString(a));
}
}
