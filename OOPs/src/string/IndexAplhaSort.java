package string;

public class IndexAplhaSort {

	public static void main(String[] args) {
		String s="the quick brown fox jumps over lazy dog";
	//	String s1[]=s.split(" ");
		char s1[]=s.toCharArray();
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]>='a' && s1[i] <='z')
			{
				System.out.print(s1[i]+" "+i);
			}
		}

	}

}
