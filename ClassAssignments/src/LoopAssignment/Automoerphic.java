package LoopAssignment;



public class Automoerphic {

	public static void main(String[] args) {
		int num=376;
		int num1=num;
		int c=0;
		int sqr=num*num;
		while(num>0)
		{
			c++;
			num=num/10;
		}
		int l=(int)(sqr%Math.pow(10, c));
		System.out.println(l);
			if(num1==l)
				System.out.println("Automorphic");
			else
				System.out.println("Not");
		
	//	if(r==)

	}

}
