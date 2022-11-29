package decisionmaking;
import java.util.Scanner;

public class CheckNumberby3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num =sc.nextInt();
		if (num % 3 == 0) {
			System.out.println(+num + " is divisable 3");
		} else {
			System.out.println(+num + " is not divisable 3");
		}
		sc.close();
	}

}
