package for_looping;

public class Prime_ {
public static void main(String[] args) {
	
	for(int i=400;i>=200;i--)
	{
		
		int mid=i/2;
		int j=2;
		while(j<=mid)
		{
			if (i%j==0)
			{
				break;
			}
			j++;
		}
			if(j>mid)
			{
				System.out.println(i);
			}
			
		}
	}
}

