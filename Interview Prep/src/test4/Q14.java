package test4;

/*14. Write a program to display columnwise minimumvalue in two dimensional array with 
dimensions nXm. [1m]*/
public class Q14 {

	public static void main(String[] args) {
		int a[][] = { { 5, 6, 3 }, { 9, 5, 7 }, { 8, 4, 1 } };
		int n = 1;
		for (int i = 0; i < a.length; i++) {
			int minc = a[0][i];
			for (int j = 0; j < a.length; j++) {
				if (a[j][i] < minc) {
					minc = a[j][i];
					System.out.println("column " + (n) + " min:" + minc);
				}
			}
			n++;
		}

	}

}
