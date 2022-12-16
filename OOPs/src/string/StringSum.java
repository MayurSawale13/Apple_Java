package string;

public class StringSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java5isa6good7";// programming language";

		int sum = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
				System.out.print(s1.charAt(i) + " ");
				sum = sum + ((s1.charAt(i) - 48));
			}

		}
		System.out.println("\nSum:" + sum);

	}

}
