package arrays;

public class ArrayLiteral {
	void arrayLength(int a[]) {
		System.out.println("Length of array:" + a.length);
	}

	void arrayElements(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	void searchEle(int a[], int element) {
		int count = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] == element) {
				System.out.println("\nelement is at :" + i);

			} else
				count++;
		}
		if (count == a.length) {
			System.out.println("element not found");
		}
	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		ArrayLiteral arr = new ArrayLiteral();
		arr.arrayLength(a);
		arr.arrayElements(a);
		arr.searchEle(a, 60);

	}

}
