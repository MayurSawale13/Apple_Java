
public class RangeOfPrimeNum {

	public static void main(String[] args) {

		int range = 100;
		boolean isPrime = true;
		int count = 0;
		for (int i = 60; i <= range; i++) {//to specify range
			for (int j = 1; j <= i; j++) {//check given number is prime or not
				if (i == j || j == 1 || i == 1)//skip /1,/number
					continue;
				if (i % j == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime == true) {
				count++;
				System.out.println(i);
			}
			isPrime = true;

		}
		System.out.println(count);
	}

}
