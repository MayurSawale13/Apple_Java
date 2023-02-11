package test9;

import java.util.Arrays;

/*4.Write a program to remove the EXTRA spaces in a given string line.
Ex: Input:  Vithamas        Technologies      Pvt     Ltd*/
public class RemoveExtraSpaces {

	public static void main(String[] args) {
		String s="  Vithamas        Technologies      Pvt     Ltd";
		String s1[]=s.split(" ");
		s=s.trim();
		System.out.println(s.trim());
		s=s.replaceAll("\\s+", "");
		System.out.println(s);
	
		System.out.println(Arrays.toString(s1));
		String s2="";
		for(int i=0;i<s1.length;i++)
		{
			/*String x=+s1[i];
			System.out.print();
			 s2+=x;*/
			
		}
		System.out.println(s2);

	}

}
