package patten_assignment;

public class Pattern24 {

	public static void main(String[] args) {
		/*
		1
		123
		12345
		12345678*/
		int rows = 5;
		int n1 = 0, n2 = 1, n3;
		for (int i = 1; i <= rows; i++) {

			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			for (int j = 1; j <= n3; j++) {

				if (i == 2 && j == 2) {
					continue;
				}
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
