package decisionmaking;
import java.util.Scanner;

public class SwitchCarExamp {

	public static void main(String[] args) {
		
		Scanner num=new Scanner(System.in);
		System.out.println("Enter number of passengers");
		int pass=num.nextInt();
		switch(pass)
		{
		default:System.out.println("Please Enter Valid Number of Passengers");
				break;
		case 4 :System.out.println("Indica is ok");
				break;
		case 8:System.out.println("KIA is ok");
				break;
		case 14:System.out.println("Traveller is ok");		
				break;
		case 20: System.out.println("Bus is ok");
				break;
				}
		num.close();

	}

}
