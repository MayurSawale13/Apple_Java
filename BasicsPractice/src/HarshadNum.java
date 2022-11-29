import java.util.Scanner;

public class HarshadNum {

	public static void main(String[] args) {
		
		Scanner n=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=n.nextInt();
		int temp=num,r,sum=0;
		while(num>0)
		{
			r=num%10;
			sum+=r;
			num=num/10;
		}
		if(temp%sum==0)
		{
			System.out.println(temp+" its harshad number");
		}
		else
		{
			System.out.println(temp+" its not harshad Number");
		}
		n.close();
	}

}
