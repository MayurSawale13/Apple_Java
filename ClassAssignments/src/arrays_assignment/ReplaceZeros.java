package arrays_assignment;

import java.util.Arrays;

public class ReplaceZeros {

	public static void main(String[] args) {
		int a[] = { 26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34 };
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0)
				a[i] = 1;
		}
		System.out.println(Arrays.toString(a));
	}

}
