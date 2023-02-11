package test9;

import java.util.Arrays;

public class CopyStringToArray {
			///a1b2
			//0123
	public static void main(String[] args) {
		String s1 = "abcdefg";
		String s2 = "1234";
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		char[] copy1 = new char[ch1.length + ch2.length];
		int j = 0, k = 0;
		for (int i = 0; i < copy1.length; i++) {

			if (j < ch1.length) {
				copy1[i] = (ch1[j]);
				j++;
			}
			if (k < ch2.length) {
				copy1[i + 1] = ch2[k];
				k++;
				i++;
			}

		}
		// System.out.println(Arrays.toString(copy1));
		String s3 = new String(copy1);
		System.out.println(s3);
	}

}
