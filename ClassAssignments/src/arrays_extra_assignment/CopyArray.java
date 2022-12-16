package arrays_extra_assignment;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int a[] = { 2, 6, 8, 11 };
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {

			System.out.print(b[i] + ",");
		}

	}

}
