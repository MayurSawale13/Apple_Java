package polymorphism;

public class Series {
	
	double series(double n)
	{
		double i,s=0.0d;
		for(i=1;i<=n;i++)
			{
			s+=(1/i);
			}
		return s;
	}
	double series(double a,double n)
	{
		double i,s=0.0;
		for(i=1;i<=n;i++)
		{
			int c=3;
			//s=s+(1/a*2i);
			
		}
	return s;
	}

	public static void main(String[] args) {
		
		Series s=new Series();
		double result=s.series(5);
		System.out.println(result);
	}

}
