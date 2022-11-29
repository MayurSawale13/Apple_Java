package AssignmentOnVariableAndDataTypes;

import java.util.Scanner;

public class Convert_Cm_to_M_And_Km {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Enter Length in Centimeter to convert into Meters:");
		float c = num.nextFloat();

		System.out.println(c + " cm=" + (0.01 * c) + " Meters");
		System.out.println("Enter Length in Meters to convert into Kilometer:");
		float m = num.nextFloat();
		System.out.println(m + " Meter =" + (0.001 * m) + " Kilometer");
		num.close();

	}

}
