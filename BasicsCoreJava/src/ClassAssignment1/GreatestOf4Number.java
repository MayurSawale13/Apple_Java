package ClassAssignment1;
import java.util.Scanner;
public class GreatestOf4Number {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Enter First number");
		int num1 = num.nextInt();

		System.out.println("Enter Second number");
		int num2 = num.nextInt();

		System.out.println("Enter Third number");
		int num3 = num.nextInt();

		System.out.println("Enter Fourth number");
		int num4 = num.nextInt();

		if (num1 >= num2 && num1 >= num3 && num1 >=num4)
			System.out.println(+num1 + " is the greater Number ");
		else if (num2 >= num1 && num2 >= num3 && num2 >=num4)
			System.out.println(+num2 + " is the greater Number ");
		else if (num3 >= num2 && num3 >= num1 && num3 >=num4)
			System.out.println(+num3 + " is the greater Number ");
		else 
			System.out.println(+num4 + " is the greater Number ");
		num.close();

	}

}
