package interfacepack;

public class ProjectBankVaccineMain {

	public static void main(String[] args) {
	
		BankingProject b=new BankingProject();
		b.disply();
		b.requirement();
		b.planning();
		b.design();
		
		Vaccine v= new Vaccine();
		v.requirement();
		v.planning();
		v.design();

	}

}
