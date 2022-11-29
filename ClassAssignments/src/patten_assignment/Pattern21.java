package patten_assignment;

public class Pattern21 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j) {
					System.out.print(i - 1+" ");
					continue;
				}
				System.out.print("0"+" ");
			}
			System.out.println();
		}

	}

}
