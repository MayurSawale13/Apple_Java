package abstraction;

public abstract class Car {
	
	void dashboard()//Concrete methods
	{
		System.out.println("dashboard of car");
	}
	void feature()
	{
		System.out.println("feature of wheels and color ");
	}
	abstract void price();//abstract method
	abstract void safety();
	abstract void alloyWheel();

}
