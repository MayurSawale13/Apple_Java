package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class CarMain {
	void addCar(ArrayList<Car> al)
	{
		al.add(new Car(15,2500000,"thar","M&M"));
		al.add(new Car(1,300000,"ambasador","TATA"));
		al.add(new Car(36,400000,"swift","Maruti"));
		al.add(new Car(3,200000,"indica","TATA"));
		al.add(new Car(1,200000,"nano","TATA"));
		
	}

	public static void main(String[] args) {
		ArrayList<Car> al=new ArrayList<>();
		CarMain c=new CarMain();
		c.addCar(al);

		System.out.println(al);
		System.out.println("----sort using comparable with id------");
		Collections.sort(al);
		System.out.println(al);
		
	}

}
