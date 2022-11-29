package patten_assignment;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 9;
		for (int i = 1; i <= rows; i++) {
			if (i == 8) {
				continue;
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = rows - 1; i >= 1; i--) {
			if (i == 8) {
				continue;
			}
			for (int j = 1; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println();
		}

	}

}
