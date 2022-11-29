package looping;

public class Prime_Mid {

	public static void main(String[] args) {
		
		int num=5,i=2;
		int mid=num/2;
		
		while(i<=mid) //i value should be <=mid then its not prime
		{
			if(num%i==0)
			{
				break;
			}
		i++;
		}
		
		if(i>mid)//i>mid then prime number
		{
			System.out.println(num+" is prime number");
		}
		else
			System.out.println(num+" is not a prime number");
	}

}
