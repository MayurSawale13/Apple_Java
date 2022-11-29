package patten_assignment;

public class Pattern9 {
	public static void main(String[] args) {
		int rows = 9;
		for (int i = rows; i >= 1; i--) {
			for (int k = 1; k <= rows - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int l = i - 1; l >= 1; l--) {
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
