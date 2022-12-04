package oops_Assignment;

public class LaptopMain {
	

	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.setNoOfUsbPort(3);
		l1.setSpeed(2);
		System.out.println("No of USB port:"+l1.getNoOfUsbPort());
		System.out.println("Processor Speed:"+l1.getSpeed());

	}

}
