package day4;

public class StaticInstanceBlock {
	// Static variable and block :
	// 1.stored when class is loaded
	// 2.one distributed to each object
	// Instance block:
	// 1.executed before constructor

	int accNo;
	String name;
	static String bankname;
	static int ifscCode = 10102;
	StaticInstanceBlock(int a, String s) {
		System.out.println("Constructor called");
		accNo = a;
		name = s;
		display();
	}

	{
		accNo = 1;
		name = "Ali";
		System.out.println("Instace block1 called :\naccount number :" + accNo + "\n Name:" + name);
	}
	static {
		System.out.println("FlowOfExecution: Static >> Instance >> Constructor");
		StaticInstanceBlock.bankname = "SBI";
	
		System.out.println("Static block1 called \nIFSCCODE:" + StaticInstanceBlock.ifscCode + "\nBank: " + StaticInstanceBlock.bankname);
	}
	static void changeIfsc(int a)
	{
		ifscCode=a;
		//System.out.println("ifsc code changed using static method:"+StaticInstanceBlock.ifscCode);
		
	}

	void display() {

		System.out.println(accNo + " \n" + name+ "\nIFSC CODE: "+StaticInstanceBlock.ifscCode);
		
	}

	public static void main(String[] args) {

		StaticInstanceBlock obj = new StaticInstanceBlock(2, "Balaji");
		obj.display();
		StaticInstanceBlock.changeIfsc(10113);
		StaticInstanceBlock obj1 = new StaticInstanceBlock(4, "Carmi");
		obj1.display();
	}
}
