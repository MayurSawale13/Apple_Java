package strings;

import java.util.Arrays;

public class ArrayDuplicate {

	public static void main(String[] args) {
		String s[] = { "a", "java", "core", "java", "core", "sesseion", "java" };
		String s1[] = new String[s.length];
		/*
		 * for (int i = 0; i < s.length; i++) { int k=(s[i].compareTo(s[i+1]));
		 * if(k==1){ String temp=s[i]; s[i]=s[i+1]; s[i+1]=temp; } }
		 */
		for(String x:s)
		 {
			int i=0;
			 if(!s1[i].contains(x)&&i<s1.length)
			 {
				 s1[i]=s[i];
				 i++;
			 }
			 
		 }
		System.out.println(Arrays.toString(s1));
		for (int i = 0; i < s.length; i++) {
			int count = 1;
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equalsIgnoreCase(s[j])) {
					count++;
					s[j] = "0";
				}

				if (!s[i].equals("0") && count == 2) {
					s1[i] = s[i];
				}
			}

		}
		/*
		 * for(String x:s) { for(String a:s) { if(a.equals(x)) {
		 * System.out.println(a); } } }
		 */
		System.out.println(Arrays.toString(s1));
	}

}
