package patten_assignment;

public class Pattern16 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			int alpha = 64;
			for (int k = 6; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + alpha) + " ");
			}
			System.out.println();
		}
	}
}
