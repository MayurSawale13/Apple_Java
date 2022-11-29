package patten_assignment;

public class Pattern20 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5 - i; j++) {

				System.out.print("1");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
