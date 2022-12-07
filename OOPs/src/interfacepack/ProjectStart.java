package interfacepack;

public interface ProjectStart {
	String compname="TCS";//global var are static,final,public
	void requirement();
	void planning();
	void design();
	default void feedback()//Back ward compatabilty 
	{
		System.out.println("the feedback is good");
	}
	static void display()//can use static method
	{
		System.out.println("Project completed");
	}
	
	

}
