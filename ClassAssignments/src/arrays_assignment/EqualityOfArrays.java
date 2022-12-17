package arrays_assignment;

import java.util.Arrays;

public class EqualityOfArrays {

	public static void main(String[] args) {
		
		int a[]={12, 22,32, 42, 52, 62};
		int b[]={52, 22, 62, 12, 42, 22};
		if(a.length==b.length)
		{
			/*Arrays.sort(a);
			Arrays.sort(b);*/
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length-1;j++)
				{
					if((a[j]>a[j+1]))
					{
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length-1;j++)
				{
					if((b[j]>b[j+1]))
					{
						int temp=b[j];
						b[j]=b[j+1];
						b[j+1]=temp;
					}
				}
			}
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
					break;
				else
					count++;
			}
			if(count==a.length)
				System.out.println("Arrays are equal");
			else
				System.out.println("Arrays not are equal");

		}
		

	}

}
