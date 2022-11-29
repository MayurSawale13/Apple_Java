package Encapsulation;

import java.util.Scanner;

public class GooglePay {
	
	void withdrawl(int a,Account b)
	{
	
		int accbal=b.getBal();
		if(accbal>a)
		{
			accbal=accbal-a;
			b.setBal(accbal);
		}
		else 
			System.out.println("Low Bal");
		
	}
	void deposite(int d,Account c)
	{
		int amount=c.getBal();
		amount=amount+d;
		c.setBal(amount);
	}
public static void main(String[] args) {
	Account a1=new Account();
	a1.setAccno(01);
	a1.setBal(1000);
	a1.setId(2);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter amount to wthdraw:");
	int amt=sc.nextInt();
	System.out.println("Enter amount to deposite:");
	int de=sc.nextInt();
	GooglePay p=new GooglePay();
	p.withdrawl(amt, a1);
	System.out.println("amount withdran,Avail bal: "+a1.getBal());
	p.deposite(de, a1);
	
	System.out.println("amount deposited,Avail bal: "+a1.getBal());
}
}
