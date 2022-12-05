package abstraction;

public class Mobile extends Electronics {

	void price() {
		price = 20000;
		System.out.println("Mobile Price:" + price);
	}

	void rating() {
		System.out.println("Rating:3 star");
	}

	void features() {
		color = "blue";
		weight = "0.5kg";
		System.out.println("features:\ntouch screen,gaming mode \ncolor:" + color + "\nweight:" + weight);
	}

	void electricityConsumption() {
		System.out.println("Electricity:Normal usage");
	}

}
