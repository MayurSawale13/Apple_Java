package oops_basic;

import java.util.Scanner;

public class Car {
	int speed,price;
	String color,mop,name;
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		name=sc.next();
		System.out.println("Enter price: ");
		price=sc.nextInt();
		System.out.println("Enter color: ");
		color=sc.next();
		System.out.println("Enter mode of payment: ");
		mop=sc.next();
		System.out.println("Enter speed: ");
		speed=sc.nextInt();
		
		
		
	}
	void discount()
	{
		float dis;
		if(mop.equalsIgnoreCase("online"))
		{
			dis=price*0.03f;
			System.out.println("discount is: "+dis);
			System.out.println("price after discount: "+(price-dis));
		}
		else if(mop.equalsIgnoreCase("offline"))
		{
			dis=price*0.05f;
			System.out.println("discount is: "+dis);
			System.out.println("price after discount: "+(price-dis));
		}
	}
	void display()
	{
		System.out.println("Car Name: "+name+"\nmax. speed: "+speed+"\ncolor: "+color+"\nprice: "+price+"\nMode of payment: "+mop);
	}

	public static void main(String[] args) {
		
		Car c=new Car();
		c.setData();
		c.display();
		c.discount();
	}

}
