package AssignmentOnSwitch;
import java.util.Scanner;

public class SwitchCalciExm {

	public static void main(String[] args) {
	
		Scanner num = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int num1 = num.nextInt();
		System.out.println("Enter second Number :");
		int num2 = num.nextInt();
		System.out.println("Enter operation to perform:1.Addtion \n2.Substraction\n"
				+"3.Multiplication \n4.divide\n");
		int op = num.nextInt();
		switch (op) {
		case 1:
			System.out.println("you have selected Addition");
			int sum = num1 + num2;
			System.out.println(+num1 + " + " + num2 + " = " + sum);
			break;
		case 3:
			System.out.println("you have selected multiplication");
			int multi = num1 * num2;
			System.out.println(+num1 + " * " + num2 + " = " + multi);
			break;
		case 2:
			System.out.println("you have selected to find Substraction");
			int sub = num1 - num2;
			System.out.println(+num1 + " -" + num2 + " = " + sub);
			break;
		case 4:
			System.out.println("you have selected to find Division");
			int div = num1 / num2;
			System.out.println(+num1 + " /" + num2 + " = " + div);
			break;
		default:
			System.out.println("Invalid Operation");
		}
		num.close();

	}

}
