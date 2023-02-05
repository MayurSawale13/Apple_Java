package strings;

import java.util.Arrays;

public class FreqOfChar {

	public static void main(String[] args) {
		String s="the waar is coming";
		String s1[]=s.split("\\s");
		for(int i=0;i<s1.length;i++){
			for(int j=0;j<s1.length-1;j++){
				int l1=s1[j].length();
				int l2=s1[j+1].length();
				if(l1>l2){
					String temp=s1[j];
					s1[j]=s1[j+1];
					s1[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(s1));
	}
}

