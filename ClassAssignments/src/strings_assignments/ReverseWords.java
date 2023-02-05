package strings_assignments;

public class ReverseWords {

	void reverseWord(String s)
	{
		String s1[]=s.split("\\s");
		for(int j=0;j<s1.length;j++)
		{
		for(int i=s1[j].length()-1;i>=0;i--)
		{
			System.out.print(s1[j].charAt(i));
		}
		System.out.println();
		}
	}
	public static void main(String[] args) {
		ReverseWords r=new ReverseWords();
		String s="hello world";
		r.reverseWord(s);
	}

}
