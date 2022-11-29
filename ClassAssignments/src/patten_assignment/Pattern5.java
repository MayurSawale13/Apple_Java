package patten_assignment;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			System.out.print("*");
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println("*");
		}
		for (int i = rows - 1; i >= 1; i--) {
			System.out.print("*");
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}

			System.out.println("*");
		}
	}

}
