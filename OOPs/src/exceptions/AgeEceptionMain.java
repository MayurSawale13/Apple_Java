package exceptions;

import java.util.Scanner;

public class AgeEceptionMain {
	
	void ageCheck(int age) throws AgeExeption{
		if(age< 18){
			throw new AgeExeption("age is less can not allow ride");
		}
		else if(age>60){
			throw new AgeExeption("age is more can not allow ride");
		}
		else
			System.out.println("enjoy your ride");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

System.out.println("Enter age:");
		int age=sc.nextInt();
		AgeEceptionMain ad= new AgeEceptionMain();
		try{
			ad.ageCheck(age);
		}
		catch(AgeExeption e)
		{
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
