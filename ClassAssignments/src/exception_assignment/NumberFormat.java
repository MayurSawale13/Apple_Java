package exception_assignment;

public class NumberFormat {

	public static void main(String[] args) {
		Integer a = new Integer("abc");
		try {
			System.out.println(a);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println(a);
	}

}
