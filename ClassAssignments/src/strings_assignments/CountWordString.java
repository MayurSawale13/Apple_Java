package strings_assignments;

public class CountWordString {

	public static void main(String[] args) {

		String s = "heelo eorld";
		String c[] = s.split(" ");
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			count++;

		}
		System.out.println(s);
		System.out.println(count);
	}

}
