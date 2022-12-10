package video_assignments.day2;

public class RangeOfPrimeNumber {

	public static void main(String[] args) {
		boolean IsPrime = true;
		int range = 50;
		for (int i = 1; i < range; i++) {
			if(i==1)
			{
				IsPrime=false;
			}
			for (int j = 2; j <i; j++) {
				
				if (i % j == 0 ) {
					IsPrime = false;
					break;
				}
			}
			if (IsPrime == true)
			{
				System.out.println(i);
			}
			IsPrime = true;
		}

	}

}
