package array2d;

public class Array2d {

	public static void main(String[] args) {
		
		int a[][]={{1,2,3},{5,9,8},{6,8,7}};
		//display array
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
//diagnal elements:
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if (i==j)
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		//upper trinagle:
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if (i<j)
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		//lower tringle
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if (i>j)
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
