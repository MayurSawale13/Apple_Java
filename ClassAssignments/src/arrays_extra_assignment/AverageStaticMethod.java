package arrays_extra_assignment;

public class AverageStaticMethod {

	public static int average(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return (sum / array.length);
	}

	public static double average(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];
		return (sum / array.length);
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		double d[] = { 6.0, 3.4, 6.4, 1.2, 4.0 };
		// Don't need to create i.e. static methods are class level methods
		int avg = AverageStaticMethod.average(a);
		System.out.println("Average of int array:" + (avg));
		// static method are called using classname
		double avg1 = AverageStaticMethod.average(d);
		System.out.println("Average of int array:" + (avg1));
	}

}
