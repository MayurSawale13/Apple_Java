package enumexample;

public enum Tickets {
	SILVER(100),GOLD(200),PLATINIUM(250);
	int v;
	private Tickets(int v){
		this.v=v;
	}

}
