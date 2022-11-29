package day4;

public class HitCounter {
	int pin;
	static int counter;
	String userName;
	public void logIn(int a,String s){
		pin=a;
		
		userName=s;
		//HitCounter.counter++;
		userDisplay();
	}
	HitCounter(){
		HitCounter.counter++;
		pin=6363;
		userName="DoctorSurprise";
	}
	HitCounter(int a,String s){
		HitCounter.counter++;
		pin=a;
		userName=s;
	}
		public static void display(){
			System.out.println("Hitcounter:"+HitCounter.counter);
		}
		void userDisplay(){
			System.out.println("username: "+userName);
			System.out.println("pin:"+pin);
		}
}
