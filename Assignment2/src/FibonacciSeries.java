
public class FibonacciSeries {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1, n3;
		int size = 20;

		for (int i = 1; i <= size; ++i) {
			System.out.println(n1);

			n3 = n1 + n2;// add n1 and n2 to get n3

			// swap n1 and n2 to get next number n3
			n1 = n2;
			n2 = n3;
		}

	}

}
