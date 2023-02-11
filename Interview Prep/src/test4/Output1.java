package test4;

public class Output1 {
	
		public static void main(String[] args) {
		Car wagonR = new Car();
		wagonR.modelno = 3245;
		wagonR.name = "WagonR";
		wagonR.price = 500000;
		wagonR.company = "Maruti";
		Car baleno = new Car(3408, "Baleno", "Suzuki");
		if (baleno.price > wagonR.price)
		System.out.println(baleno);
		else
		System.out.println(wagonR);
		}
		}
		class Car {
		int modelno;
		String name;
		int price;
		static String company;
		Car() { }
		Car(int modelno, String name, String c) {
		this.modelno = modelno;
		this.name = name;
		this.company = c;
		}
		public String toString() {
		return modelno + " " + name + " " + price + " " + company;
		}
		

}
