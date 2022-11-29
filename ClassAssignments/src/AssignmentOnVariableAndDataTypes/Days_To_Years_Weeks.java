    package AssignmentOnVariableAndDataTypes;

import java.util.Scanner;

public class Days_To_Years_Weeks {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Enter Number of days");
		int d = num.nextInt();
		float y = d / 365f;
		float w = d / 7f;
		System.out.println(d + " Days =" + y + " Year");
		System.out.println(d + " Days =" + w + " Weeks");
		num.close();

	}

}
