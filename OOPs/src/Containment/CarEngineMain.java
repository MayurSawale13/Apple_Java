package Containment;

public class CarEngineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engine e2=new Engine(4,89,"1002rpm","Audi");
		Car c2=new Car(1002,1500000,"Red",e2);
		System.out.println("Car Details: "+c2);
		System.out.println("Engine Details: "+e2);
		/*Engine e1=new Engine();
		e1.setComp("tata");
		e1.setCylinder(4);
		e1.setRpm("1000 rpm");
		e1.setTorque(90);

		Car c=new Car();
		
		c.setColor("blue");
		c.setId(1001);
		c.setPrice(1000002);
		c.setE(e1);
		System.out.println("Info Of Car: ");
		System.out.println("car ID: "+c.getId()+"Car color : "+c.getColor()+"Car price: "+c.getPrice());
		System.out.println("Engine Details: "+e1);*/
	}

}
