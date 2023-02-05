package pattern;

import java.util.Arrays;

/*9
898
78987
6789876
567898765
45678987654
3456789876543
234567898765432
12345678987654321*/
public class Pattern1 {

	public static void main(String[] args) {
		int r=2,c=3;
		int a[][]={{1,2,3},{4,5,6}};
		int b[][]=new int[c][r];
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++){
				b[i][j]=a[j][i];
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
	;
	}

}
