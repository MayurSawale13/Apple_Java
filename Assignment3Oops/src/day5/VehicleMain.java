package day5;

import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d1=new Driver();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Driver id: ");
		int a=sc.nextInt();
		System.out.println("Enter Driver name:");
		String dn=sc.next();
		d1.getDriver(a,dn);
		
		Car c=new Car();
		System.out.println("Enter car model");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Car name: ");
		String cn=sc.nextLine();
		c.getDetails(n, cn, d1);
		c.display();
		//sc.close();

	}

}
