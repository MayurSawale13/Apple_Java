import java.util.Scanner;

public class TernaryStatement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks and subject");
		int marks = sc.nextInt();
		String sub = sc.next();
		String grade = "";

		grade = (marks >= 80 ? "Distiniction"

				: (marks >= 70 && marks < 80) ? "First Class"
						: (marks >= 60 && marks < 70 && sub.equalsIgnoreCase("physics")) ? "pass"
								: (marks >= 60 && marks < 70) ? "special pass" : "Fail");

		System.out.println(grade);
		sc.close();

	}

}
