package day6;

abstract class Start  {
	int speed;
	static String direction="forward";
	abstract public void move(int newspeed);
	public void setSpeed(int s)
	{
		speed=s;
	}
	public int getSpeed()
	{
		return speed;
	}

}
class Ball extends Start{
	
	public void move(int s)
	{
		speed=s;
		System.out.println("Ball is moving at at speed "+speed+" in "+direction+
				"");
	}
	public void color()
	{
		System.out.println("ball is of red color");
	}
}

public class AbstrctEx{
	public static void main(String[] args) {
		 Start a=new Ball();
		 a.setSpeed(140);
		 System.out.println(a.getSpeed());
		 a.move(80);
		
		
	}
}