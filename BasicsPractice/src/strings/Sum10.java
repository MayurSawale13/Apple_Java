package strings;

public class Sum10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==10)
					System.out.println(a[i]+" "+a[j]);
			}
		}
		

	}

}
