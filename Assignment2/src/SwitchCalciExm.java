import java.util.Scanner;

public class SwitchCalciExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		System.out.println("Enter First number: ");
		int num1=num.nextInt();
		System.out.println("Enter second Number :");
		int num2=num.nextInt();
		System.out.println("Enter operation to perform");
		char op=num.next().charAt(0);
		switch (op)
				{
		case '+' : System.out.println("you have selected Addition");
					int sum=num1+num2;
					System.out.println(+num1+" + "+num2+" = "+sum);
					break;
		case '*' :System.out.println("you have selected multiplication");
					int multi=num1*num2;
					System.out.println(+num1+ " * "+num2+ " = "+multi);
					break;
		case '%' : System.out.println("you have selected to find reminder");
					int rem=num1%num2;
					System.out.println(+num1+ " % "+num2+ " = "+rem);
					break;
		default :	System.out.println("Invalid Operation");			
				}
		num.close();
	}

}
