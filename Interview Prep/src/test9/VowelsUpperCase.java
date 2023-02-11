package test9;

public class VowelsUpperCase {

	void vowelUpperCase(String s, char ch[]) {
		for (int i = 0; i < s.length(); i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				
				ch[i] = (char) (ch[i] - 32);
			}

		}
		String s1 = new String(ch);
		System.out.println(s1);
	}

	public static void main(String[] args) {
		VowelsUpperCase v = new VowelsUpperCase();
		String s = "i bought a toy car";
		char[] ch = s.toCharArray();
		v.vowelUpperCase(s, ch);

	}

}
