package strings_assignments;

import java.util.Arrays;

public class HighestFreqChar {

	public static void main(String[] args) {
		String s="hello world";
		char ch[]=s.toCharArray();
		int freq[]=new int[ch.length];
		int min,max;
		char minChar=s.charAt(0);
		char maxChar=s.charAt(0);
		for(int i=0;i<ch.length;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && (ch[i]!=' ') && ch[i]!='0')
				{
					freq[i]++;
					ch[j]='0';
				}
			}
		}
		min=max=freq[0];
		for(int i=0;i<freq.length;i++)
		{
			
			if(min>freq[i] ){
				min=freq[i];
				minChar=ch[i];
		}
			if(max<freq[i] && ch[i]!='0'){
				max=freq[i];
				maxChar=ch[i];
		}

		}
		System.out.println("MinChar: "+minChar+"-"+min);
		System.out.println("MaxChar: "+maxChar+"-"+max);
		System.out.println(Arrays.toString(ch));
	}

}
	
