package arrays;

public class AvgMarks {
	void avgMark(int a[],int n)
	{
		int sum=0;
		int num=0;
		for(int i=0;i<n;i++)
		{
			//num=a[i];
			sum+=a[i];
		}
		System.out.println("Average marks:"+(sum/n));
	}
	

}
