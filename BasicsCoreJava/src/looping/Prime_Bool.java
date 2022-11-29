package looping;

public class Prime_Bool {

	public static void main(String[] args) {
		int num=11,i=2;
		boolean p=true; 
		while(i<num)
		{
			if(num%i==0)
			{
			p=false;
			break;
			}
			i++;
		}
		if(p==true)
		{
			System.out.println(num+" is prime number");
		}
		else
			System.out.println(num+" is not prime number");

	}

}
