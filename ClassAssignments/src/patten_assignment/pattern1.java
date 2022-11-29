package patten_assignment;

public class pattern1 {

	public static void main(String[] args) {

		int rows = 5;
		for (int i = rows; i >= 1; i--) { // i=number rows
			for (int k = 1; k <= rows - i; k++) { // space=rows-i
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) { // j=column/print *
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
