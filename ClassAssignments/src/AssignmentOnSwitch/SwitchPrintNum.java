package AssignmentOnSwitch;

import java.util.Scanner;

public class SwitchPrintNum {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter range to print");
		int n = num.nextInt();
		int i = 1;
		System.out.println("Number from 1:" + n);
		while (i <= n) {
			switch (i) {
			default:
				System.out.print(i+" ");
			}
			i++;
		}
		num.close();
	}

}
