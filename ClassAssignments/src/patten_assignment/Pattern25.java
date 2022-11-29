package patten_assignment;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1 2 6 39 1525 
		1 5 13 25 41 61*/
		
		int j = 1;
		for (int i = 1; i <= 5; i++) {

			System.out.print(j + " ");
			j = i + (j * j);
		}
		System.out.println();

		int k = 4, l = 1;
		for (int i = 1; i <= 6; i++) {
			System.out.print(l + " ");
			l = l + k * i;
		}
		
	}

}
