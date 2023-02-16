package arrays_assignment;

import java.util.Arrays;

public class SquareSearch {

	public static void main(String[] args) {
		int a[] = { 23, 43, 25, 49, 12, 9, 78, 66, 39, 0 };
		System.out.println(Arrays.toString(a));
		System.out.println("square in the arrays are: ");
		for (int i = 0; i < a.length; i++) {
			int sqr = (int) Math.sqrt(a[i]);
			if (a[i] == sqr * sqr && a[i] > 0)
				System.out.print(a[i] + " ");
			System.out.println((char)72);

		}
	}

}
