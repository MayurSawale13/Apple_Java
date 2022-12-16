package arrays_extra_assignment;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int a[] = { 5, 6, 8, 11, 20, 56 };
		for (int i = a.length - 1; i >= 0; i--)// in single array
			System.out.print(a[i] + ",");
		int b[] = new int[a.length];
		for (int i = a.length - 1; i >= 0; i--)// using another array
			b[i] = a[i];
		System.out.println("\n" + Arrays.toString(b));
	}

}
