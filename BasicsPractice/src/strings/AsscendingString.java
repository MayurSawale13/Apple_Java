package strings;

public class AsscendingString {

	public static void main(String[] args) {
		
		String s[]={"java","india","core","advance"};
		int max=s[0].length();
		int k=0;
		for(int i=0;i<s.length;i++)
		{
			if(max<s[i].length())
			{
				max=s[i].length();
				k=i;
			}
		}
		System.out.println(s[k]);
		
		for(int i=0;i<s.length;i++)
		{
			
			for(int j=0;j<s.length-1;j++)
			{
				int n =s[j].length();
				int n1=s[j+1].length();
				if(n<n1)
				{
					String temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			
			}
			
		}
		System.out.println(s[0]);
	}
}
