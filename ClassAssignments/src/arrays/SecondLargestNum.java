package arrays;

public class SecondLargestNum {

	public static void main(String[] args) {
		// int a[] = {3,2,6,8,11};
		int a[] = { 10, 20, 6, 8, 11, 20, 56 };
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
		System.out.println("Second Highest Number:" + a[1]);

	}

}
