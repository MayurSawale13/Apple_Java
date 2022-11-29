
public class NumberDigitSum {

	public static void main(String[] args) {
	
		int num =43;
		int sum=0;		//num1 to store digit of number ex:5
		while(num>0)
		{
			
			int digit=num%10;//store reminder num1 ie last digit
			sum+=digit;
			num=num/10;//eliminate last digit
			
		}
		System.out.println(sum);
	}

}
