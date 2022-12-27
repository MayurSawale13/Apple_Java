package string;

public class RemoveLastOccurance {

	public static void main(String[] args) {
		String s="hello World";
		//1.using Substring
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)=='l'){
				s1=s.substring(0, i)+s.substring(i+1);
			break;
			}
		}
		System.out.println(s1);

	}

}
