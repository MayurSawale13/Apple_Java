package interfacepack;

public class ScientificCalc extends SimpleCal {
	void power(int b,int p)
	{
		int c=(int) Math.pow(b, p);
		System.out.println(b+"power"+p+" :"+c);
	}
	void sqrt(double a)
	{
		System.out.println("sqrt of"+a+":"+(Math.sqrt(a)));
	}

}
