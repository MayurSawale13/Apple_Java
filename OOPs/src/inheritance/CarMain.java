package inheritance;

public class CarMain {

	public static void main(String[] args) {
		AudiA8 au=new AudiA8();
		au.nowheel();
		au.fuel();
		au.seatwarmer();
		au.autoWiper();
		au.setPrice(90);
		System.out.println("Price:"+au.getPrice());

	}

}
