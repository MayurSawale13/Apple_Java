package arrays2d;

public class SumOfInnerEle {

	public static void main(String[] args) {
					//  0  1  2
		int a[][] = { { 1, 2, 3,4 },
				      { 4, 5, 6,8}, 
				      { 6, 5, 7,10} };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == 0 || i == 2 || j == 0 || j == 3)
					continue;
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
