package strings_assignments;

public class SearchAllOccuranceChar {

	public static void main(String[] args) {
		String s = "java can occurance of chance";
		char ch[] = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'c') {
				System.out.println(ch[i] + " index " + i);
				count++;
			}
		}
		System.out.println("Total Number Of occurance:" + count);
	}

}
