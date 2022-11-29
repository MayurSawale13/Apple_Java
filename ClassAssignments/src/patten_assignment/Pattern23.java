package patten_assignment;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	0
		1 1 
		2 3 5 
		8 13 21 34 */
		int row = 4;
		int n1 = 0, n2 = 1, n3;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == 1 && j == 1) {
					System.out.print("0" + " ");
					continue;
				}
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				System.out.print(n3 + " ");
			}
			System.out.println();
		}

	}

}
