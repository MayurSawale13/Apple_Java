package oops;

import java.util.Scanner;

public class Movie {
	int yor;
	float profit;
	String actorname,prodname;
	Scanner sc=new Scanner(System.in);
	void acceptDetails()
	{
		System.out.println("Enter Year of Release: ");
		yor=sc.nextInt();
		System.out.println("Enter profit: ");
		profit=sc.nextFloat();
		System.out.println("Enter Actor Name and producer name: ");
		actorname=sc.next();
		prodname=sc.next();
		sc.close();
	}
	void display()
	{
		System.out.println("Year Of Release: "+yor);
		System.out.println("Profit: "+profit);
		System.out.println("Actor: "+actorname);
		System.out.println("Producer: "+prodname);
	}

	public static void main(String[] args) {
		
		Movie m=new Movie();
		m.acceptDetails();
		m.display();
		
	}

}
