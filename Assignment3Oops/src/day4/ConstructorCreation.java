package day4;

public class ConstructorCreation {
	int id;
	String name;
	//1.Default constructor:object initialized  at the time of creation.
	ConstructorCreation(){
		System.out.println("Default creation");
		id=1;
		name="sundar";
	}
	//parameter :depends upon order and number of parameter is called  
	ConstructorCreation(int a,String s)
	{
		System.out.println("parameterised constructor called");
		id=a;
		name=s;
	}
	ConstructorCreation(String s,int a){
		System.out.println("differant parameter order constructor called ");
		id=a;
		name=s;
		
	}
	void disply(){
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		ConstructorCreation c=new ConstructorCreation();
		ConstructorCreation c1=new ConstructorCreation(2,"leela");
		ConstructorCreation c2=new ConstructorCreation("mayur",3);
		c.disply();
		c1.disply();
		c2.disply();
		
	}

}
