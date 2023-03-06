package august_final_test;

/*18.WAP to accept a string and make following changes [1M]
Shift each letter right by two step eg A ->C ,Y->A,Z->B
Each digit by next higher digit.
Space by underscore*/
public class Q18 {
	///int a[]={1,2,3,4,5,6};
	//int b[]={5,6,7,8,9,10};
	//int c[]={1,2,3,4,5,5,6,6,7,8,9,10}
			//i
	void formatString(String s) {
		char[] c = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (c[i] >= 'a' && c[i] <= 'z') {
				c[i] = (char) ('a' + (((int) c[i] + 2) % 'a') % 26);
			} else if (c[i] > '0' && c[i] < '9') {
				c[i] = (char)('1'+(( (int) c[i] + 1)% '1')% 10);

			} else if (c[i] == '_') {
				c[i] = ' ';

			}

		}
		String s2 = new String(c);
		System.out.println(s2);
	}

	public static void main(String[] args) {
		Q18 d = new Q18();
		String s = "ayz__529";
		d.formatString(s);
	}

}
