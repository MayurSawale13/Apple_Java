package array;
import java.text.SimpleDateFormat;
import java.util.Date;
public class SimpleDate {
	 
	
	 
	
		public static void main(String args[]){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(new Date()); 
			System.out.println(date);
		
	}
}
