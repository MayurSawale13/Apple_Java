package decisionmaking;
import java.util.Scanner;

public class IfElseLadderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter a charcter");
		char c = ch.next().charAt(0);
		if (c == 'A' || c == 'a') {
			System.out.println(+c+ " is a vowel");
		} else if (c == 'E' || c == 'e') // single statement doesn't require {}
											// bracket
			System.out.println(c+ " is a vowel");
		else if (c == 'i' || c == 'I')
			System.out.println( " is a vowel"+c);
		else if (c == 'O' || c == 'o')
			System.out.println(+c+ " is a vowel");
		else if (c == 'U' || c == 'u')
			System.out.println(+c+ " is a vowel");
		else
			System.out.println(+c+ " is consonant");
		ch.close();

	}

}
