package exception_assignment;

import java.util.Scanner;

public class ThrowEx {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter positive value");
		
		int a=sc.nextInt();
		if(a<0)
		{
			System.out.println("Enter positive value: "+a);
			throw new Exception();
			
		}
		System.out.println(a);
		

	}

}
