package day6;

interface Movealbe{
	
	String direction="forward"; 
	void move(int s);
	void show();
}
class Car1 implements Movealbe {
	//int speed;
	public void move(int s1)
	{
		System.out.println("car is moving with "+s1+" in "+ Movealbe.direction+ " direction");
	}
	public void show()
	{
		System.out.println("the Car is moving");
	}
}
public class InterfaceEx {

	public static void main(String[] args) {
		
		Movealbe m=new Car1();
		m.move(140);
		m.show();
	}

}
