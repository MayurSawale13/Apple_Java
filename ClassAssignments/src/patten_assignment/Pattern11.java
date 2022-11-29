package patten_assignment;

public class Pattern11 {

	public static void main(String[] args) {

		for (char i = 'F'; i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (char i = 'A'; i <= 'F'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
