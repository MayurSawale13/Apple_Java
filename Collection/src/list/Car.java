package list;

import java.util.ArrayList;
import java.util.Iterator;

public class Car {

	int id, lyear, price;
	String name, brandName;

	Car(int id, int lyear, int price, String name, String brandName) {
		this.id = id;
		this.lyear = lyear;
		this.price = price;
		this.name = name;
		this.brandName = brandName;

	}

	void deleteCar(ArrayList<Car> c) {
		Iterator<Car> itr = c.iterator();
		while (itr.hasNext()) {
			Car f = itr.next();
			if (f.lyear == 1990) {
				itr.remove();
			}
		}
	}

	public String toString() {
		return id + " " + lyear + " " + price + " " + name + " " + brandName;
	}

	public static void main(String[] args) {
		ArrayList<Car> c = new ArrayList<>();
		Car c1 = new Car(25, 1990, 400000, "swift", "maruti");
		Car c2 = new Car(023, 2006, 150000, "nano", "tata");
		Car c3 = new Car(54, 1990, 1000000, "suv", "mahindra");
		Car c4 = new Car(65, 2010, 1100000, "eco", "ford");
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		System.out.println(c);

		c1.deleteCar(c);
		System.out.println(c);
	}

}
