package arrays;

public class ReverseArray {
  void reverse(int a[],int n)
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
  void replceNum(int a[],int n)
  {
	  int b[]=new int[n];
	 
	  for(int i=0;i<a.length;i++)
	  {
		  
		  if(a[i]<0)
			  b[i]=0;
		  else 
			  b[i]=a[i];
	  }
	  for(int i=0;i<n;i++)
		 {
			 
			 System.out.print(b[i]+" ");
		 }
  }
	public static void main(String[] args) {
		int n=8;
		int a[]={2,-1,56,-2,67,-9,90,-5};
		ReverseArray r=new ReverseArray();
		//r.reverse(a,n);
		r.replceNum(a, n);
	}

}
