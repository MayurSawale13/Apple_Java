package abstraction;

public class Laptop extends Electronics {
	void price() {
		price = 50000;
		System.out.println("Laptop Price:" + price);
	}

	void rating() {
		System.out.println("Rating:4 star");
	}

	void features() {
		color = "silver";
		weight = "2.5kg";
		System.out.println("Features:windows 11 ,keyboard\ncolor:" + color + "\nweight:" + weight);
	}

	void electricityConsumption() {
		System.out.println("Electricity:Medium usage");
	}

}
