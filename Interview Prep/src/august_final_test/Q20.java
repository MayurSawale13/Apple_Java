package august_final_test;

/*20.WAP to draw the following pattern using . Note: Input is an odd number: [1M]*
12345
ABCD
123
AB
1
AB
123
ABCD
12345*/
public class Q20 {

	public static void main(String[] args) {
		int alpha = 64;
		for (int i = 5; i > 0; i--) {
			if (i % 2 != 0) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
			} else {
				for (int j = 1; j <= i; j++) {
					System.out.print((char) (alpha + j));
				}
				System.out.println();
			}

		}
		for (int i = 2; i < 6; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
			} else {
				for (int j = 1; j <= i; j++) {
					System.out.print((char) (alpha + j));
				}
				System.out.println();
			}
		}

	}

}
