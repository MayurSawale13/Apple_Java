package Encapsulation;

public class Shape {
	float area;
	public void area(float r)
	{
		 area= (3.14f*r*r);
		System.out.println("Circle Area: "+area);
	}
	public void area(float l,float b)
	{
		area= (0.5f*l*b);
		System.out.println("area of Triangle: "+area);
	}
	public void area(int s)
	{
		area=s*s;
		System.out.println("area of square: "+area);
	}
	public void area(int l,int b)
	{
		area= l*b;
		System.out.println("area of rectangle: "+area);
	}
	public static void main(String[] args) {
		Shape s=new Shape();
		s.area(3,9);
		
	}
}
