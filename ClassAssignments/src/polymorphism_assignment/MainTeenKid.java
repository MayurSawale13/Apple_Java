package polymorphism_assignment;

public class MainTeenKid {

	public static void main(String[] args) {
		
		Kid k1,k2;
		k1=new Bigkid();
		k1.readBook();
		
		k2=new Teenager();
		k2.readBook(2);

	}

}
