package inheritance;

public class Fruits {
	void taste()
	{
		System.out.println("Sweet");
	}

}
class Apple extends Fruits{
	void taste()
	{
		System.out.println("Apple Taste");
	}
}
class Strawberry extends Fruits{
	void taste()
	{
		System.out.println("Strawberry Taste");
	}
}