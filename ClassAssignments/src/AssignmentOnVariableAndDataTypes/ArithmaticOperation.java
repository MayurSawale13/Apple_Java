package AssignmentOnVariableAndDataTypes;

import java.util.Scanner;

public class ArithmaticOperation {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Enter two numbers");
		float f1 = num.nextFloat();
		float f2 = num.nextFloat();

		System.out.println(f1 + "+" + f2 + "=" + (f1 + f2));
		System.out.println(f1 + "+" + f2 + "=" + (f1 - f2));
		System.out.println(f1 + "+" + f2 + "=" + (f1 * f2));
		System.out.println(f1 + "+" + f2 + "=" + (f1 / f2));
		System.out.println(f1 + "+" + f2 + "=" + (f1 % f2));
		num.close();

	}

}
