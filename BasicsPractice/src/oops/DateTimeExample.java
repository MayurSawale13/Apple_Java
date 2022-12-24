package oops;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTimeExample {

	
	public static void main(String[] args) {
		//give current date format of: date yyyy/mm/date
		//
		DateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		LocalDate l=  LocalDate.now();
		Date d=new Date();
		//object cant stored in database so convert to String;
		String date=l.toString();
		String d1=sdf.format(d);
		System.out.println(d1);
		
		LocalTime t=LocalTime.now();//hh/mm/ss;
		String time=t.toString();
		System.out.println(time);
		
		LocalDateTime lt=LocalDateTime.now();
		String dt=lt.toString();
		System.out.println(dt);
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MMM-yyyy  HH:mm:ss");
		String dtfe=lt.format(dtf);
		System.out.println(dtfe);
		
		
		Calendar c=Calendar.getInstance();
		String dr=sdf.format(c.getTime());
		System.out.println(dr);
		c.add(Calendar.DATE, 7);
		String newDate=sdf.format(c.getTime());
		System.out.println(newDate);
		
	}

}
