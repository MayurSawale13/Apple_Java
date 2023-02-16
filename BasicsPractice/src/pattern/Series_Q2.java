package pattern;

import java.util.Scanner;

/*3.Write a program to print following series. 0,1,3,6,10,15,21,28.
Accept number of terms to print from user.*/
public class Series_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range");
		int r = sc.nextInt();
		int k=1;
		int j=0;
		for(int i=0;i<r;i++){
			System.out.print(j+" ");
			j=j+k;
			k++;
		}

	}

}
