package video_assignments;

public class MaxOf3Number {

	public static void main(String[] args) {
		int a=3,b=6,c=8;
		//three possible conditions 
		//also can achieve using array
	
		if(a>=b && a>=c)
		{
			System.out.println(a);
			
		}
		else if(b>=a && b>=c)
		{
			System.out.println(b);
		}
		else 
		{
			System.out.println(c);
		}
	}

}
