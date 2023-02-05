package arrays_assignment;

public class SwapElements {

	public static void main(String[] args) {
		int a[]={2, 4, 9, 0};
		int mid =(a.length/2);
		for(int i=0;i<mid;i++)
		{
			int temp=a[i];
			a[i]=a[mid+i];
			a[mid+i]=temp;
		}
	for(int e:a)
	{
		System.out.print(e+" ");
	}
	}

}
