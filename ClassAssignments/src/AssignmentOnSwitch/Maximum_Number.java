package AssignmentOnSwitch;

import java.util.Scanner;

public class Maximum_Number {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1=n.nextInt();
		int n2=n.nextInt();
		int max=0;
		if(n1>=n2)
			max=1;
		else 
			max=2;
		switch(max)
		{
		case 1:System.out.println(n1+" is maximum nuber");
			break;
		case 2:System.out.println(n2+ " is Maximum Number");
			break;
		default:
			System.out.println("Please enter valid integer number!!");	
		}
		n.close();
	}

}
