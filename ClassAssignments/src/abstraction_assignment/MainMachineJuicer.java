package abstraction_assignment;

public class MainMachineJuicer {

	public static void main(String[] args) {
		Juicer j=new Juicer();
		j.rotate();
		j.crush();
		j.filter();

		Machine m=new Juicer();
		m.crush();
		m.rotate();
		//m.filter();//canot call child class method
	}

}
