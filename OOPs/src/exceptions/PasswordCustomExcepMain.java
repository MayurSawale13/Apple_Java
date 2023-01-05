package exceptions;

import java.util.Scanner;

public class PasswordCustomExcepMain {
	
	public void passwordVerify(String pass) throws PasswordException
	{
		
		if(pass.equals("Password")){
			System.out.println("LogIn Successfull");
		}
		
		else
			throw new PasswordException("Enter Correct password");
		
		}
	
public static void main(String[] args) throws PasswordException {
	/*Scanner sc=new Scanner(System.in);
	System.out.println("Enter Username and password");
	String uname=sc.next();
	String pass=sc.next();*/
	PasswordCustomExcepMain u1=new PasswordCustomExcepMain();
	//try{
	u1.passwordVerify("pass");
	u1.passwordVerify("Password");
	//}
	//catch(PasswordException e){
		
		System.out.println("enter correct password");
	//}
	


	
}
}
