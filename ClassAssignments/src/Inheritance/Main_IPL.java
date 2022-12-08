package Inheritance;

public class Main_IPL {
	public static void main(String[] args) {
		RCB rcb=new RCB();
		rcb.play();
		IPLTeam mi=new MI();//upcasting
		mi.play();
	}
}
