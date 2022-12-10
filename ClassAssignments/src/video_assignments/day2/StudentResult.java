package video_assignments.day2;
import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mark=new Scanner(System.in);
		System.out.println("Enter the marks:");
		int m=mark.nextInt();
		
		if(m>=0 && m<=100)
		{
			if(m>=80)
			{
				System.out.println("Result: A Grade ");
			}
			else if(m>=60 && m<=80)
			{
				System.out.println("Result: B grade");
			}
			else if(m>=40 && m<=60)
			{
				System.out.println("Result : C Grade");
			}
			else 
			{
				System.out.println("FAIL");
			}
				
		if(m>=40)
			System.out.println("student is pass");
		else
			System.out.println("student is fail");
		}
		else
		{
			System.out.println("Entered Marks are inavalid");
		}
		mark.close();

	}

}
