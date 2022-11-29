package AssignmentOnVariableAndDataTypes;

import java.util.Scanner;

class CelsiusToFahrenheight {

	public static void main(String[] args) {

		Scanner d = new Scanner(System.in);

		System.out.println("Enter Tempreture in Degree Celsius  to Convert into Fahrenheight :");
		float c = d.nextFloat();
		System.out.println(c + " Celsius=" + (32 + c) + " Fahrenheight");
		
		System.out.println("Enter Tempreture in Fahrenheight Degree to Convert into Celsius  :");
		float f = d.nextFloat();
		System.out.println(c + "F Fahrenheight=" + (f-32 ) + "C Celsius");

		d.close();
	}

}
