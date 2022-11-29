package AssignmentOnVariableAndDataTypes;

import java.util.Scanner;

public class AreaOfEqilateralTriangle {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Enter side value : ");
		float s = num.nextFloat();
		float area = (1.7320508075688772f / 4) * s * s;
		System.out.println("Area Of Equilateral Triangle: " + area);
		num.close();
	}

}
