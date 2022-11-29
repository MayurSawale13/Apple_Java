
public class PrimeNum1 {

	public static void main(String[] args) {
		int num=11;
		int flag=0;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				
				break;
			}
		}
		if (flag==1)
		{
			System.out.println(num+" is not prime");
		}
		else 
			System.out.println(num+" is a prime number");

	}

}
