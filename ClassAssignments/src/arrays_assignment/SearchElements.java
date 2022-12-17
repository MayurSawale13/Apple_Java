package arrays_assignment;

public class SearchElements {

	public static void main(String[] args) {
		int a[] = { 12, 3, 65, 29, 5, 25, 44, 77, 49 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 65 || a[i] == 77)
				System.out.println(a[i] + " Element found at index " + i);
		}
	}

}
