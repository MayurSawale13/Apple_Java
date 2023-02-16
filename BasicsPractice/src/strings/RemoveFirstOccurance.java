  package strings;

public class RemoveFirstOccurance {

	public static void main(String[] args) {
		String s="Hello world";
		char ch[]=s.toCharArray();
		int count=0;
		String s3="";
		char s1[]=new char [ch.length];
		for(int i =ch.length-1;i>=0;i--)
		{
		
			if(ch[i]=='l'){
				
				count=count+1;
				//System.out.print(count);
			}
			if(count==1 && ch[i]=='l')
			{
				
				continue;
			}
			 s1[i]=ch[i];
			 s3=s3+ch[i];
		}
		String s2=new String(s1);
		//System.out.println(s2);
		for(int i=s3.length()-1;i>=0;i--)
		{
			System.out.print(s3.charAt(i));
		}
		
	}

}
