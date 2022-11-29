package decisionmaking;
import java.util.Scanner;

public class AvgMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter English Marks:");
		float Eng=sc.nextFloat();
		System.out.println("Enter Math Marks:");
		float math=sc.nextFloat();
		System.out.println("Enter Physics Marks:");
		float phy=sc.nextFloat();
		System.out.println("Enter Chemistry Marks:");
		float chem=sc.nextFloat();
		System.out.println("Enter Biology Marks:");
		float bio=sc.nextFloat();
	/*	,math,phy,chem,bio;
		Eng=35.2f;
		math=10.5f;
		phy=35;chem=50;
		bio=70;*/
		float Avg;
		float total=Eng+math+phy+chem+bio;
		Avg=(Eng+math+phy+chem+bio)/5;
		System.out.println("Avg marks is"+Avg);
		float percent=(total/500)*100f;
		System.out.println("Percentage:"+percent);
		sc.close();
			
	}

}
