package patten_assignment;

public class Pattern17 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			int alpha = 64;
			for (int j = 6; j >= i; j--) {
				System.out.print((char) (alpha + j) + " ");
			}
			System.out.println();
		}

	}

}
