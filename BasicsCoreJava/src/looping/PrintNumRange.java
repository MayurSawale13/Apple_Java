package looping;

import java.util.Scanner;

public class PrintNumRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=1,i;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter limit");//Initialize variable
		i=num.nextInt();
		while(i1<=i)  	//Check Condition
		{							//i=1	i=2....i=5
			System.out.println(i1);	//1		2		5
			i1++;					//Increment/Decreament
		}
		num.close();

	}

}
