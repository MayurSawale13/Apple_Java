package for_looping;

import java.util.Scanner;

public class Power_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("enter a power");
		int n = num.nextInt();
		System.out.println("enter base");
		int b = num.nextInt();
		int p=1;
		for (int i = 1; i <= n; i++) {
			
			p = b * p;
			
		}
		System.out.println(b+" power "+n+" :" + p);
		num.close();
	}

}
