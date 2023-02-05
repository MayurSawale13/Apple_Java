package strings_assignments;

public class MinWord {

	public static void main(String[] args) {
		String s2 = "This is an umbrella";
		String s1[] = s2.split("\\s");
		String minWord = " ";
		for (int i = 0; i < s1.length; i++) {
			int size = s1[i].length();
			int min = s1[0].length();
			if (size < min) {
				min = size;
				minWord = s1[i];
			}
		}
		System.out.println("Min Word:" + minWord);
	}

}
