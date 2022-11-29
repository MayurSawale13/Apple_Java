package day4;

public class Travel {
	void bookTicket(Plane p)
	{
		p.display();
	}
	void bookTicket(Bus b)
	{
		b.disply();
	}

	public static void main(String[] args) {
		
		Travel t=new Travel();
		Plane po=new Plane();// pass Plane object to method as parameter
		Bus bo=new Bus();
		t.bookTicket(po);
		t.bookTicket(bo);
	}

}
