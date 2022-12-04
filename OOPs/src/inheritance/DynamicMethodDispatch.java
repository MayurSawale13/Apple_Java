package inheritance;

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		Fruits f = new Fruits();
		f.taste();
		f = new Apple();// Upcasting
		f.taste();
		f = new Strawberry();// Upcasting
		f.taste();
	}
}
