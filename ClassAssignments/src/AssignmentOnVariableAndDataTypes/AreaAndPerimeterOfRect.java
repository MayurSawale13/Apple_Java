package AssignmentOnVariableAndDataTypes;

import java.util.Scanner;

public class AreaAndPerimeterOfRect {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter Length and Breadth of Rectangle");
		float l = num.nextFloat();
		float b = num.nextFloat();

		System.out.println("Area of Rectangle: " + (l * b));
		System.out.println("Perimeter of Rectangle: " + 2 * (l * b));
		num.close();
	}

}
