package patten_assignment;

public class Pattern10 {

	public static void main(String[] args) {
		int rows = 9;
		for (int i = rows; i >= 1; i--) {
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = i; j <= rows - 1; j++) {

				System.out.print(j);

			}
			for (int l = rows; l >= i; l--) {
				System.out.print(l);
			}

			System.out.println();
		}

	}

}
