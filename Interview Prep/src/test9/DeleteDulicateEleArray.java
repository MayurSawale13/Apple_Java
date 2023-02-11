package test9;

import java.util.Arrays;

public class DeleteDulicateEleArray {

	void removeDuplicate(char ch[]) {
		char[] chnew = new char[ch.length];
		int k = 0;
		for (int i = 0; i < ch.length; i++) {
			int c = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					c++;
					ch[j] = '0';
				}

			}

			if (c == 1 && ch[i] != '0') {
				chnew[k] = ch[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(chnew));
	}

	public static void main(String[] args) {
		DeleteDulicateEleArray d=new DeleteDulicateEleArray();
		char[] ch = { 'a', 'b', 'b', 'n', 'u', 'y', 'x', 's', 'y' };
		d.removeDuplicate(ch);
	}

}
