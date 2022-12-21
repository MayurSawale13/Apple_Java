package arrays;

public class VariableArgs {
	void add(String b,int...a )
	{
		float sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("avg marks of "+b+" :"+sum/a.length);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableArgs vb=new VariableArgs();
		vb.add("mayur",85,90,85);
	}

}
