package patten_assignment;

public class Pattern12 {

	public static void main(String[] args) {
		int rows = 5;
		for (int i = 1; i < rows; i++) {
			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		for (int i = rows; i >= 1; i--) {
			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
