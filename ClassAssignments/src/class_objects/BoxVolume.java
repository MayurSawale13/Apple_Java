package class_objects;

import java.util.Scanner;

public class BoxVolume {

	void volume(float l,float b,float h)
	{
		
		System.out.println("Volume of box :"+(l*b*h));
	}
	public static void main(String[] args) {
		BoxVolume v=new BoxVolume();
		Scanner num=new Scanner(System.in);
		System.out.println("Enter Lenght,Breadth and Height :");
		float l=num.nextFloat();
		float b=num.nextFloat();
		float h=num.nextFloat();
		v.volume(l, b, h);
		num.close();
	}

}
