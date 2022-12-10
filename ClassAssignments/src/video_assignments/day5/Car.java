package video_assignments.day5;

public class Car {
	int modelno;
	String name;
	Driver d;
	public void getDetails(int m,String s,Driver o)
	{	
		modelno=m;
		name=s;
		d=o;
		
	}
	void display()
	{
		System.out.println("car model: "+modelno+"\nCar name: "+name+"\nDriver Details: ");
		//d.display();
		System.out.println("car model: "+d.d_id+"\nCar name: "+d.d_name+"");
		//d.display();
	}
}
