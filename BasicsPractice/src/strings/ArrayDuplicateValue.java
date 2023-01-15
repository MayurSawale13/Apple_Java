package strings;

import java.util.Arrays;

public class ArrayDuplicateValue {

	public static void main(String[] args) {
		int a[]={10,20,30,40,50,10,20,10,20,60};
		int a1[]=new int[a.length]; 
		Arrays.sort(a);
		
		//int index=0;
		for(int i=0;i<a.length;i++)
		{ 
			int count=1;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j])
				{
					System.out.print(a[j]);
					count++;
					/*IF(COUNT==2)
					{
						SYSTEM.OUT.PRINT(A[I]);
					}*/
					break;
				}
				
			}
//			if(count==1)
//			{
//				a1[i]=a[i];
//				System.out.print(a[i]+" ");
//			}
		}
		//System.out.println(Arrays.toString(a1));

	}

}
