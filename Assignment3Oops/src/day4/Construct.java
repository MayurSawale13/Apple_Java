package day4;

public class Construct {
	String name;
	int id;
	float salary;
	public static String c_name="TCS";
	public static void changeName(String cname)
	{
		
		c_name=cname;
		System.out.println("Static method");
	}
	Construct(){
		id=01;
		name="malik";
		salary=25003.25f;
		
	}
	void pfcalculate()
	{
		salary=salary*0.7f;
		System.out.println("class method 1");
	}
	float pfcalculate(float salary)
	{
		salary=this.salary;
		salary=salary*0.8f;
		return salary;
	}
	
	void display()
	{
		
		System.out.println("Emp Name: "+name+"\nEmp Id: "+id+"\nSalary: "+salary+"\nCompany: "+Construct.c_name);
	}
	public static void main(String[] args) {
		
		Construct c=new Construct();
		c.display();		//default constructor
		c.pfcalculate();
		Construct.changeName("Wipro");
		c.display();
		System.out.println("pf : "+c.pfcalculate(c.salary));
		
	}

}
