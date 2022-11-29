package AssignmentOnSwitch;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter Radius of Circle");
		float r = num.nextFloat();

		System.out.println("Area of Circle: " + (3.1412 * r * r));
		System.out.println("Circumference of Circle: " + (2 * 3.1412 * r));
		System.out.println("Diameter of Circle: " + (2 * r));
		num.close();

	}

}
