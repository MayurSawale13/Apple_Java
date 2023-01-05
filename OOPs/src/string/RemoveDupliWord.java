package string;

public class RemoveDupliWord {

	public static void main(String[] args) {
		String s = "java session java core java";
		String s1[] = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			int count = 1;
			for (int j = i + 1; j < s1.length; j++) {
				if (s1[i].equals(s1[j])) {
					s1[j] = "0";

					// count++;
				}

			}
			// System.out.print(s1[i]+" ");
			if (!s1[i].equals("0") && count == 1) {
				System.out.print(s1[i] + " ");
			}
		}

	}

}
