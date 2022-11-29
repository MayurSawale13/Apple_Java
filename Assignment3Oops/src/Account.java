
public class Account {
	int acc_no;
	float deposite;
	float balance,w;
	
	String name;
	void insertDetails(int a,String n,float bal){
		acc_no=a;
		 name=n;
		 balance=bal;
	}
		
			
	public void displayDetails(){
		//insertDetails(acc_no,name);
		System.out.println("Account Number:"+acc_no);
		System.out.println("name:"+name);
		System.out.println("Bal: "+balance);
		
		
	}
	void checkBalance(){
		
		
		System.out.println("Account Balance is:"+balance);
	
	}
	void deposite1(float c){
		 deposite=c;
		
		 System.out.println("enter amount to deposite:"+c);
		 balance=balance+c;
		 //	return c;
	}
	void moneyTransfer(float b1,AccountExEncap a )
	{
		System.out.println("amount to be transfer: "+b1);
		System.out.println("Avail balance: "+(a.getBal()-b1));
	}
	void withdraw(float w1)
	{
		w=w1;
		System.out.println("withdraw amount: "+w);
		balance=balance-w;
	}

	public static void main(String[] args) {
		Account ac=new Account();
		ac.insertDetails(1, "badShah",1000f);
		ac.displayDetails();
		
		ac.deposite1(100f);	
		
		ac.withdraw(10f);
		ac.checkBalance();
		
		/*AccountExEncap a=new AccountExEncap();
		a.setAccId(1001);
		a.setBal(3000.55f);
		a.setName("shershah");
		System.out.println("Account No: "+a.getAccId());
		System.out.println("Account Name: "+a.getName());
		System.out.println("Account Balanace: "+a.getBal());
		ac.moneyTransfer(300.25f, a);*/
		
			}
		
		
	}

