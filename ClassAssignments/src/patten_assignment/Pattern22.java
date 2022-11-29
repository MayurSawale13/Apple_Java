package patten_assignment;

public class Pattern22 {

	public static void main(String[] args) {
		
		/*
		0 
		0 1 
		0 1 1 
		0 1 1 2 
		0 1 1 2 3  */
		int row = 5;
		
		for (int i = 1; i <= row; i++) {
			int n1 = 0, n2 = 1, n3=1;
			for (int j = 1; j <= i; j++) {
				
				if ( i==1 || j == 1) {
					System.out.print("0" + " ");
					continue;
				}

				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				System.out.print(n1 + " ");
			}
			System.out.println();
		}
	}

}
