package video_assignments.day2;
import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner A=new Scanner(System.in);
		System.out.println("Enter Albhabet: ");
		char Alpha=A.next().charAt(0);
		
		if(Alpha=='a'||Alpha=='e'||Alpha=='i'||Alpha=='o'||Alpha=='u')
		{
			System.out.println( +Alpha+ " is VOWEL");
		}
		else if(Alpha=='A'||Alpha=='E'||Alpha=='I'||Alpha=='O'||Alpha=='U')
		{
			System.out.println(+Alpha+" is VOWEL");
		}
		else
		{
			System.out.println( " is consonant " +Alpha);
		}
		A.close();
	}

}
