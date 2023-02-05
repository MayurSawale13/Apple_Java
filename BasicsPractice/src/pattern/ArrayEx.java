package pattern;

import java.util.Arrays;

public class ArrayEx extends Exception  {
	public static void main(String[] args) {
		String s="hello world";
		char ch[]=s.toCharArray();
		int freq[]=new int [ch.length];
		for(int i=0;i<ch.length;i++){
			freq[i]=1;
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j] && ch[i]!='0' && ch[i]!=' '){
					freq[i]++;
					ch[j]='0';
				}
			}				
			}

		for(int i=0;i<freq.length;i++){
			if(ch[i]!='0' && ch[i]!=' ')
			System.out.print(" "+ch[i]+"-"+freq[i]);
	}
	}
	
	

}
