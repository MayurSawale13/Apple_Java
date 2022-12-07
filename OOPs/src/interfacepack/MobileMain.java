package interfacepack;

public class MobileMain {

	public static void main(String[] args) {
		NoramlMobile p = new NoramlMobile();
		p.calling();
		p.fm();
		p.messaging();
		p.ram();

		SmartPhone s = new SmartPhone();
		s.calling();
		s.fm();
		s.messaging();
		s.ram();
		s.battery();
		s.gamingMode();

	}

}
