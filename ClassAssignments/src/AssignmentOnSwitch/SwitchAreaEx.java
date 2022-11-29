package AssignmentOnSwitch;

import java.util.Scanner;

public class SwitchAreaEx {

	public static void main(String[] args) {

		Scanner word = new Scanner(System.in);
		System.out.println("type word/abbreviation from list to calculate Area:"
				+ "\ncircle\nrectangle\nsquare\nrat (right angle triangle)\n"
				+ "coc (Circumference of Circle)\npos (perimeter of square))");
		String shape1 = word.nextLine();
		String shape = shape1.toLowerCase();
		float area;

		switch (shape) {
		case "circle":
			System.out.println("you have selected circle area to calculated:\n" + "Enter radius value: ");
			float r = word.nextFloat();
			area = 3.1412f * r * r;
			System.out.println("Area of Circle is: " + area);
			break;
		case "rectangle":
			System.out.println("you have selected Rectangle area to calculated:\n" + "Enter length and bredth value: ");
			float l = word.nextFloat();
			float b = word.nextFloat();
			area = l * b;
			System.out.println("Area Of Reactangle is: " + area);
			break;
		case "square":
			System.out.println("you have selected Square area to calculated:\n" + "Enter side value: ");
			float side = word.nextFloat();
			area = side * side;
			System.out.println("Area of Square :" + area);
			break;
		case "rat":
			System.out.println("you have selected right angle tringle area to calculated:\n" + "Enter leg value: ");
			float leg = word.nextFloat();
			area = (leg * leg) / 2;
			System.out.println("Area of Right angle Triangle is: " + area);
			break;
		case "coc":
			System.out
					.println("you have selected Circumference Of Circle area to calculate:\n" + "Enter radius value: ");
			float r1 = word.nextFloat();
			area = 2 * 3.1412f * r1;
			System.out.println("Circumference of Circle: " + area);
			break;
		case "pos":
			System.out.println("you have selected Perimeter of square to calculated:\n" + "Enter side value: ");
			float s = word.nextFloat();
			area = 4 * s;
			System.out.println("Perimeter Of square: " + area);
			break;
		default:
			System.out.println("Incorect Word!! Type word/abbreviation from menu");
			word.close();
		}

	}

}
