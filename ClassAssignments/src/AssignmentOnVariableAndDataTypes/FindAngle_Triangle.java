package AssignmentOnVariableAndDataTypes;

import java.util.Scanner;

public class FindAngle_Triangle {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter Two angles of tringle: ");
		float n1 = num.nextFloat();
		float n2 = num.nextFloat();
		System.out.println("Third angle of Triangle: " + (180 - n1 - n2));
		num.close();
	}

}
