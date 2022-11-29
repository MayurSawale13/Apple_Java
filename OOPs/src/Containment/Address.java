package Containment;

public class Address {
	String area, city, state;
	int pincode;

	Address(int pin, String area, String city, String state) {
		this.pincode = pin;
		this.area = area;
		this.city = city;
		this.state = state;
	}

	public String toString() {
		return "Area: " + area + " City:" + city + " State:" + state;
	}
}
