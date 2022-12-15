package string;

public class StringArray {
	public static void main(String[] args) {
		String s="java Language";
		char ch[]=s.toCharArray();
		char ch1='a';
		int count=0;
		for(int i=0;i<ch.length;i++)
			if(ch[i]==ch1)
			{
				System.out.println(ch[i]);
				count++;
			}
		for(int i=0;i<ch.length;i++)
			if(ch[i]==ch1)
			{
				ch[i]='A';
				
				
			}
		System.out.println(count);
		String s1=new String(ch);
		System.out.println(s1);
		
	}

}
