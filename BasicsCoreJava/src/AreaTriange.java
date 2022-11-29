import java.util.Scanner;

public class AreaTriange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base value");
		float base = sc.nextFloat();
		System.out.println("Enter height value");
		float height = sc.nextFloat();

		/*
		 * base=1.7f; height=6.5f;
		 */
		float areatringle = 0.5f * base * height;
		System.out.println("Area Of triangle is " + areatringle);
		sc.close();

	}

}
