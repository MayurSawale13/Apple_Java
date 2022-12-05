package abstraction;

public abstract class Electronics {
	int price;
	String color, weight;

	void processor()// concreate method :common to all
	{
		System.out.println("Processor:SnapDragon");
	}

	void semiConductor()// Concreate Method
	{
		System.out.println("Semiconductor:Micron Semiconductor");
	}

	abstract void rating();

	// Abstract method
	abstract void features();

	abstract void price();

	// Abstract Method
	abstract void electricityConsumption();

}
