package strings;

public class StringDupli {
	public static void main(String[] args) {
		String s="kljdf java 0  0 java  0 0 0 java 0";
					/*0    0      1    2*/
		String s1[]=s.split(" ");
		String s2="";
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i]!=null){
				if(!s1[i].equalsIgnoreCase(s1[j]))
				{
					s1[j]=null;
				}
			
			}
			}
		}
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!=null)
			{
				System.out.print(s1[i]);
			}
		}
	}

}
