package strings;

import java.util.Arrays;

public class ArrayEvenIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,2,3,5,6,7,8,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0 ){
				
				sum=sum+1;
			}
			else if(a[i]%2!=0 && a[i]!=5){
				
				sum=sum+3;
			}
			else if (a[i]==5){
			
				sum=sum+5;
			}
		}
		System.out.println(sum);
	}

}
