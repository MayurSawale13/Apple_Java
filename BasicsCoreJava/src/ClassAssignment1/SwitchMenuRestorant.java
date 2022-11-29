package ClassAssignment1;

import java.util.Scanner;

public class SwitchMenuRestorant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner menu = new Scanner(System.in);
		System.out.println("Enter a Number from Menu:\n1.Rice\t\t25\n2.Roti\t\t30\n3.Idli\t\t40\n4.Dosa\t\t45\n ");
		int num = menu.nextInt();
		System.out.println("Enter quantity");
		int quantity = menu.nextInt();
		int  total;
		//switch choice evalute only equality.
		switch (num) {
		case 1:
			total = 25 * quantity;
			System.out.println("Total bill=" + total);
			break;
		case 2:
			total = 30 * quantity;
			System.out.println("Total bill=" + total);
			break;
		case 3:
			total = 40 * quantity;
			System.out.println("Total bill=" + total);
			break;
		case 4:
			total = 45 * quantity;
			System.out.println("Total bill=" + total);
			break;
		default:
			System.out.println("INVALID selection !!Please enter number from menu ");
		}
		menu.close();

	}

}
