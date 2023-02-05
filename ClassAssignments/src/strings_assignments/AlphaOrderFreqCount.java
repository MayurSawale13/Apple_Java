package strings_assignments;

import java.util.Arrays;

public class AlphaOrderFreqCount {

	public static void main(String[] args) {
		String s = "the quick brown fox jumps over lazy dog";
		char ch[] = s.toCharArray();
		Arrays.sort(ch);
		int freq[] = new int[ch.length];
		for (int i = 0; i < ch.length; i++) {
			freq[i] = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != '0' && ch[i] != ' ') {
					freq[i]++;
					ch[j] = '0';

				}
			}
		}
		int cout = 0;
		for (int i = 0; i < freq.length; i++) {
			if (ch[i] == '0' || ch[i] == ' ')
				continue;
			else {
				System.out.print(ch[i] + " " + freq[i]);
				cout++;
			}
		}
		System.out.println("\n" + cout);

	}

}
