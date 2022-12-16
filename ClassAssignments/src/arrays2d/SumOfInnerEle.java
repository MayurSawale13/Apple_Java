package arrays2d;

public class SumOfInnerEle {

	public static void main(String[] args) {
					//  0  1  2
		int a[][] = { { 1, 2, 3 },
				      { 4, 5, 6 }, 
				      { 6, 5, 7 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 0 || i == 2 || j == 0 || j == 2)
					continue;
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
