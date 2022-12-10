package video_assignments.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int sum = 0;
		int r;
		int num = 153;
		int temp = num;
		while (num > 0) {

			r = num % 10;
			sum = sum + r * r * r;
			num = num / 10;
		}
		if (sum == temp) {
			System.out.println("The Number Armstrong Number");

		} else {
			System.out.println("the is not Armstrong");
		}

	}

}
