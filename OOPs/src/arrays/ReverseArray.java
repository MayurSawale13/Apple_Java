 package arrays;

import java.util.Arrays;

public class ReverseArray {
  void reverse(int a[],int n)//using another array
  {
	 int b[]=new int[n];
	 int j=n;
	 for(int i=0;i<n;i++)
	 {
		 b[j-1]=a[i];
		 j=j-1;
	 }
	 System.out.println("Rverse Array:");
	 for(int i=0;i<n;i++)
	 {
		 
		 System.out.print(b[i]+" ");
	 }
	 
  }
  void reverseArray1(int a[],int n)//Swapping
  {
	  int mid =a.length/2;
	  System.out.println("\n"+Arrays.toString(a));
	  for (int i=0;i<mid;i++)
	  {
		  
		  int temp=a[i];
		  a[i]=a[n-i-1];
		  a[n-i-1]=temp;
	  }
	  System.out.println("Rverse Array:");
	  System.out.println(Arrays.toString(a));
  }
  void compare(int a[],int b[])
  {
	  int flag=0;
	  if(a.length==b.length)
	  {
		  flag=1;
	  }
	   }
 
	public static void main(String[] args) {
		int n=8;
		int a[]={2,-1,56,-2,67,-9,90,-5};
		ReverseArray r=new ReverseArray();
		r.reverse(a,n);
		
		r.reverseArray1(a, n);
	}

}
