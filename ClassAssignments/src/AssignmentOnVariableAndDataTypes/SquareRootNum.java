package AssignmentOnVariableAndDataTypes;

import java.util.Scanner;

public class SquareRootNum {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Enter a Number to find Square Root ");
		int n = num.nextInt();
		double sqrt = Math.sqrt(n); // using math
		System.out.println("Square Root of " + n + "=" + sqrt);
		num.close();

	}

}
