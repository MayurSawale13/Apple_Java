package inheritance;

public class AudiA8 extends Audi {
	private int price;
	void autoWiper(){
		System.out.println("Automatic Wiper");
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
