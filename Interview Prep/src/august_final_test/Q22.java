package august_final_test;

import java.util.Scanner;

/*22.WAP to accept a number and check whether 
it is binary or not.If not  throw custom exception InvalidBinaryNumber.[1M]*/
public class Q22 {
	void validate(int bin) throws InvalidBinary{
		int temp=bin;
		while(temp>0){
			int r=temp%10;
			if(r!=0 || r!=1){
				throw new InvalidBinary("InvalidBinaryNumber");
			}
		}
	}
	public static void main(String[] args) throws InvalidBinary  {
		Q22 b=new Q22();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a binary number");
		int binary=sc.nextInt();
		b.validate(binary);
		System.out.println("continue");
	}

}
