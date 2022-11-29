package AssignmentOnVariableAndDataTypes;

import java.util.Scanner;

public class SimpleInterst {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter value of P(Principle),R(Rate of interest) and T(Time in years): ");
		float p = num.nextFloat();
		float r = num.nextFloat();
		float t = num.nextFloat();
		// float n=num.nextFloat();

		System.out.println("Simple Interest:" + (p * r * t) / 100);

		/*
		 * double d=Math.pow(1+(r/n),(n*t)); double a=p*d; double ci=a-p;
		 * System.out.println(a);
		 */
		num.close();
	}

}
