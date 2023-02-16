package august_final_test;

import java.util.Arrays;

/*10.Write a program to merge two sorted array of number such that
new array is sorted array and there should be no duplicate in new array.*/
public class Q10 {

	public static void main(String[] args) {
		int a[]={10,10,20,15,35,30};
		int b[]={40,5,14,15,30};
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int k=0;
		int c[]=new int[a.length+b.length];
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<a.length;j++){
			if(c[j]==a[j])
				continue;
			else
				c[j]=a[j];
		}
	}
		/*	for(int i=0;i<a.length;i++){
			int co=1;
			for(int j=i+1;j<a.length;j++){
			 if(a[i]==a[j] && a[i]!=0 ){
				a[j]=0;
				co++;
			 }
			
			}
			
			if(a[i]!=0 && co==1){
				//System.out.print(a[i]);
				c[k]=a[i];
					k++;
			}
			else if(a[i]!=0 && co>1){
				c[k]=a[i];
				 k++;
				continue;
			}
			}*/
		System.out.println(Arrays.toString(c));
	}

}
