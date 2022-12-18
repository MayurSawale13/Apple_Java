package string;

public class EncrptChar {

	public static void main(String[] args) {
		String s="KITE";
		char[] s1=s.toCharArray();
		int sum=0;
		int p=0;
		for(int i=0;i<s1.length;i++)
		{
			p=s1[i]-64;
			System.out.println(s1[i]+"="+p);
			sum +=s1[i]-64;
		}
		System.out.println(s);
		System.out.println("potential of "+s+" : "+sum);

	}

}
