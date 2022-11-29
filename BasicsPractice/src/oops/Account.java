package oops;

import java.util.Scanner;

public class Account {
	String name;
	int acc_Id;
	float deposite;
	float balance;
	float w;
	Scanner sc=new Scanner(System.in);
	void aceeptDetails(){
		System.out.println("Enter accont name: ");
		name=sc.next();
		System.out.println("Enter account id");
		acc_Id=sc.nextInt();
	}
	void deposite()
	{
		aceeptDetails();
		System.out.println("Enter amount to deposite");
		deposite=sc.nextFloat();
		balance=balance+deposite;
		
	}
	void withdraw(){
		System.out.println("Enter ammount to withdraw: ");
		w=sc.nextFloat();
		balance=balance-w;
		
	
	}
	
	void checkBalance(){
		
		System.out.println("Enter balance: ");
		balance=sc.nextFloat();
		
		
	}
	void display()
	{
	
		System.out.println("Account Name: "+name);
		System.out.println("Account Number: "+acc_Id);
		System.out.println("Account balance: "+balance);
	}
	
	
	
	public static void main(String[] args) {
		
		Account a=new Account();
		a.deposite();
		a.checkBalance();
		a.display();
		a.withdraw();
		a.display();
	}

}
