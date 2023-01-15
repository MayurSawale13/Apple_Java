package exception_assignment;

public class Account  {
	float balance;
	void withdraw(float b) throws AccountException
	{
		if(b<0)
			throw new AccountException ("Cannot withrw negative amount");
	}
	
	void deposite(float a) throws IllegalArgumentException 
	{
		if(a>balance)
			throw new IllegalArgumentException() ;
	}
	public static void main(String[] args)  {
		Account a=new Account();
		try{
		a.deposite(-1);
		a.withdraw(-9);
		}
		catch(AccountException | IllegalArgumentException e)
		{
			System.out.println("cannot withdraw negative");;
		}
		}
}
