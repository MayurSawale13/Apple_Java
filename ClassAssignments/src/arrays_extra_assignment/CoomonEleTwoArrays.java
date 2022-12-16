package arrays_extra_assignment;

public class CoomonEleTwoArrays {

	public static void main(String[] args) {
		int a[]={10,20,80,40,30};
		int b[]={10,20,80,40,30};
		System.out.println("Common Elements:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(b[j]+",");
				}
			}
		}
		//Check wheather arrays are equal
		int count=0;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
				{
					count++;
				}
			}
		}
		if(count==a.length)
			System.out.println("Arrays are Equal");
		else
			System.out.println("Arrays are not Equal");

	}

}
