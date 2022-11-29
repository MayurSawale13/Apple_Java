package decisionmaking;
import java.util.Scanner;

public class SwitchExVowel {

	public static void main(String[] args) {
	
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter a charcter");
		char c = ch.next().charAt(0);
		switch (c) {
		//if logic is same for ever case we can use one logic for all case
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c + " is Vowel");
			break;
		default:
			System.out.println(c + " is a consonant");
		}
		ch.close();
	}

}
