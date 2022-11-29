import java.util.Scanner;

public class AreaRectangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter width ");
		float w = sc.nextFloat();
		System.out.println("enter length ");
		float l = sc.nextFloat();

		/*
		 * w=5.25f; l=6.25f
		 */;
		float arearect = w * l;
		System.out.println("Area of Rectangle is " + arearect);
		sc.close();

	}

}
