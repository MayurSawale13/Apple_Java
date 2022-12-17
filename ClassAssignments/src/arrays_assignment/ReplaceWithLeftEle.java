package arrays_assignment;

import java.util.Arrays;

public class ReplaceWithLeftEle {

	public static void main(String[] args) {
		int a[] = { 12, 3, -19, 29, 5, -61, 44, 7, -9 };
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0)
				a[i] = a[i - 1] * a[i - 1];
		}
		System.out.println(Arrays.toString(a));
	}

}
