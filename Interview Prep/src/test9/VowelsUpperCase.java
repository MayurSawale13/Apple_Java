package test9;

public class VowelsUpperCase {

	void vowelUpperCase(String s) {
		
		String s2="";
		for (int i = 0; i < s.length(); i++) {
			char ch1=s.charAt(i);
			if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
				ch1=(char) (ch1 - 32);
				
			}
			s2+=ch1;
		}
			System.out.println(s2);		
	}

	public static void main(String[] args) {
		VowelsUpperCase v = new VowelsUpperCase();
		String s = "i bought a toy car";
		char[] ch = s.toCharArray();
		v.vowelUpperCase(s);

	}

}
