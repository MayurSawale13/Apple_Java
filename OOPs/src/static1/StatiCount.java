package static1;

public class StatiCount {
	static int count;
	static
	{
		count++;
		System.out.println("stati block 1");
	}
	public static void main(String[] args) {
			System.out.println(StatiCount.count);
	}
	static
	{
		count++;
		System.out.println("stati block 2");
	}

}
