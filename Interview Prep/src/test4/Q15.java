package test4;
/*15. Write a program to display sum of both diagonals of 4X4 matrix*/
public class Q15 {

	public static void main(String[] args) {
		int a[][] = { { 1, 6, 3 }, { 9, 2, 7 }, { 3, 4, 3 } };		
		int major_diagnol=0;
		int minor_diagnol=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(i==j)
				major_diagnol+=a[i][j];
				if(j==a.length-i-1)
					minor_diagnol+=a[i][j];
				}
			}
		System.out.println("Sum of major diagnol : "+major_diagnol);
		System.out.println("Sum of major diagnol : "+minor_diagnol);
	}

}
