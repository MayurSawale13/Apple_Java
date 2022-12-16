package arrays_assignment;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]={ 3, 90, 45, 29, 37, 78};
		
		int temp[]=new int[a.length];
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nReverse Array using temp[]:\n");
		for(int i=a.length-1;i>=0;i--)
		{
			temp[i]=a[i];
			System.out.print(temp[i]+" ");
		}

	}

}
