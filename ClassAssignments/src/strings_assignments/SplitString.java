package strings_assignments;

public class SplitString {

	public static void main(String[] args) {
		String s = "HELLO_WORLD";
		String[] s1 = s.split("_");
		for (int i = 0; i < s1.length; i++)
			System.out.println("token " + (i + 1) + " " + s1[i]);

	}

}
