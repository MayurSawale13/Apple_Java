package Encapsulation;

public class FlightMain {

	public static void main(String[] args) {
		
		Flight f=new Flight();
	//	Flight f=new Flight(getId());
		f.setId(1);
		f.setSource("pune");
		f.setDest("Mumbai");
		f.setClas("economy");
		f.setCompany("indigo");
		f.display();
		f.ticketRate();

	}

}
