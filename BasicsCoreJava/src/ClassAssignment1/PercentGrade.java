package ClassAssignment1;
import java.util.Scanner;

public class PercentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter English Marks:");
		float eng = sc.nextFloat();
		System.out.println("Enter Math Marks:");
		float math = sc.nextFloat();
		System.out.println("Enter Physics Marks:");
		float phy = sc.nextFloat();
		System.out.println("Enter Chemistry Marks:");
		float chem = sc.nextFloat();
		System.out.println("Enter Biology Marks:");
		float bio = sc.nextFloat();

		float avg;
		float total = eng + math + phy + chem + bio;
		avg = (eng + math + phy + chem + bio) / 5;
		System.out.println("Avg marks are " + avg);
		float percent = (total / 500) * 100f;
		System.out.println("Percentage:" + percent);

		if (percent >= 80 && percent <= 100)
			System.out.println("Grade A");
		else if (percent >= 60 )
			System.out.println("Grade B");
		else if (percent >= 40 )
			System.out.println("Grade C");
		else
			System.out.println("Fail");

		sc.close();

	}

}
