package arrays_assignment;

public class DuplicateValues {

	public static void main(String[] args) {
		int a[] = { 3, 10, 90, 78, 56, 10, 78, 34, 61 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] == a[j])
					System.out.print(a[j] + " ");
			}
		}
	}

}
