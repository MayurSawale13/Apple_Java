package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class PotentialOfWord {

	public static void main(String[] args) {
		String s="THE SKY IS THE LIMIT";
		String s1[]=s.split(" ");
		System.out.println(Arrays.toString(s1));
		ArrayList<String> al=new ArrayList<>();
		for(String x:s1){
			al.add(x);
		}
		System.out.println(al);
		
		for(int i=0;i<al.size();i++){
			String x=al.get(i);
			int sum=0;
			for(int j=0;j<x.length();j++){
				int c1=x.charAt(j)-64;
			//	System.out.println(x.charAt(j)+" "+c1);
				sum+=c1;
			}
			System.out.println(x+""+sum);
			
			
		}
	
	}

}
