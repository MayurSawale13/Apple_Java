package video_assignments.day4;

public class StaticBindinCalci {

	public static void main(String[] args) {
		// Depending upon method signature object is binded with method 
		//at the time of compilation i.e static binding(compile-time-polymorphism) 
		/*NumberOpration n = new NumberOpration();

		
		 * System.out.println( "Addition:"+n.addNumber(7, 4)); n.addNumber(4, 5,
		 * 8.01f); n.addNumber(4, 4.5f);
		 

		n.area(5.23f);
		n.area(3.2f, 4.4f);
		System.out.println("Are o square:" + n.area(8, 6));*/
		
		HitCounter n2=new HitCounter();
		HitCounter n3=new HitCounter(3562,"hassan");
		HitCounter n1=new HitCounter();
		n2.logIn(1, "pecche");
		HitCounter.display();
		n1.userDisplay();
		n3.userDisplay();
		

	}

}
