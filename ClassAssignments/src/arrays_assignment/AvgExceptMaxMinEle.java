package arrays_assignment;

import java.util.Arrays;

public class AvgExceptMaxMinEle {

	public static void main(String[] args) {
		int a[]={52, 22, 62, 12, 42, 22};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
			System.out.println(Arrays.toString(a));
			float sum=0;
			for(int i=0;i<a.length;i++)
			{
				if(i==0 || i==a.length-1 )
					System.out.println(a[i]);
				else
					sum +=a[i];
			}
			System.out.println("Avg Except Max and min value:"+sum/(a.length-2));
	}

}
