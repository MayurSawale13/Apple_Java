package strings_assignments;

public class CopyString {

	public static void main(String[] args) {
		String s = "Java is good language";
		char ch[] = s.toCharArray();
		char a[] = new char[ch.length];
		for (int i = 0; i < ch.length; i++) {
			a[i] = ch[i];
		}
		String b = new String(a);
		System.out.println(b);

	}

}
