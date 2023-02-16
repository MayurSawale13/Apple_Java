package test9;

import java.util.Arrays;

/*4.Write a program to remove the EXTRA spaces in a given string line.
Ex: Input:  Vithamas        Technologies      Pvt     Ltd*/
public class RemoveExtraSpaces {

	public static void main(String[] args) {
		String s = "  Vithamas        Technologies      Pvt     Ltd";
		String s1[] = s.split(" ");
		char ch[] = s.toCharArray();

		s = s.replaceAll("\\s+", " ");
		System.out.println(s);
		String name = "";
		for (int i = 0; i < s1.length; i++) {
			if (s1[i].equals(""))
				continue;
			else
				name = name + s1[i] + " ";
		}
		System.out.println(name);
		String n = "";
		for (int i = 0; i < ch.length; i++) {
			if (i == ch.length - 1)
				n = n + ch[i];
			else {
				if (ch[i] != ' ' && ch[i + 1] != ' ')
					n = n + ch[i];
				else if (ch[i] != ' ' && ch[i + 1] == ' ')
					n = n + ch[i] + " ";
				else
					continue;
			}
		}
		System.out.println(n);

	}

}
