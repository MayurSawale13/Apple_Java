package abstraction;

public class ElectonicsMobileLapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile();
		m.price();
		m.rating();
		m.semiConductor();
		m.processor();
		m.features();
		m.electricityConsumption();

		Laptop l = new Laptop();
		l.price();
		l.processor();
		l.rating();
		l.semiConductor();
		l.electricityConsumption();
		l.features();

	}

}
