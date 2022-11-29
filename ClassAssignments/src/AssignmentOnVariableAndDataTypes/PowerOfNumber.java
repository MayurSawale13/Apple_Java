package AssignmentOnVariableAndDataTypes;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Enter a Number and power ");
		int n = num.nextInt();
		int p = num.nextInt();
		double d = Math.pow(n, p); // using math
		System.out.println(n + "^" + p + "=" + d);
		num.close();

	}

}
