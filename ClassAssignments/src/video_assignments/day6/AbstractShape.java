package video_assignments.day6;

abstract class Shape{
	String c;
	abstract public void shape(); 
	public void setFill(String s)
	{
		c=s;
	}
	public String getFill()
	{
		return c;
	}
}

class Triangle extends Shape{
	public void shape(){
		System.out.println("the shape is triangle"+c+"is color");
	}
	
	
	
}

public class AbstractShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Triangle();
		s.setFill("red");
		s.shape();
		
	}

}
