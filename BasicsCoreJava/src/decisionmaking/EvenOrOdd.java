package decisionmaking;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = num.nextInt();
		if (num1 % 2 == 0) {
			System.out.println(+num1 + " Number is Even");

		} else {
			System.out.println(+num1 + " number is odd");
		}
		num.close();
	}

}
