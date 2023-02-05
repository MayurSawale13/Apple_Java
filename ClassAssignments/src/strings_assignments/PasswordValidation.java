package strings_assignments;

import java.util.Scanner;

/*Create a User {String username, String password} Ask user to enter
username and password. Find out username and password entered by user
is valid or not. Do some validations for password entered by user as follows
and display appropriate message to user. Validation Message as follows -
a. If password length is less than 8 - password must be 8 chars
long.
b. If password does not contain # or @ - at least one special @ or
# character must be present.
c. If password does not contain number 0 – 9 - password must
contain at least one digit.
d. If password contains space - password must not have space.
e. If password does not contain uppercase char - password must
have at least one uppercase letter.
f. If user enters password tQ123 - message will be password
must be 8 chars long. At least one special @ or # character
must be present.*/

public class PasswordValidation {
	void checkPass(String pass){
		if(pass.length()<=8)
			System.out.println("password length is less than 8 - password must be more than 8 chars ");
		else if(!pass.contains("@") || !pass.contains("#"))
			System.out.println("least one special @ or # character must be present");
		else if(pass.contains("\\s"))
			System.out.println("password must not have space");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, pass;
		PasswordValidation p=new PasswordValidation();
		System.out.println("Enter username and password");
		name = sc.next();
		pass = sc.next();
		p.checkPass(pass);
	}

}
