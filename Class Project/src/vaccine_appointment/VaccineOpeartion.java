package vaccine_appointment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class VaccineOpeartion {
	Scanner sc=new Scanner(System.in);
	PreparedStatement pstm;
//	Connection con=null;
	void appointment(Connection con){
		
		try {
			pstm=con.prepareStatement("select * from city");
			ResultSet rs=pstm.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
			System.out.println("Enter city name:");
			String cname=sc.next();
			pstm=con.prepareStatement("select c.* from center c,city ct where c.cityid=ct.cityid and ct.cname=?");
			pstm.setString(1,cname);
			ResultSet rs1=pstm.executeQuery();
			while(rs1.next()){
				System.out.println(rs1.getInt(1)+"\t"+rs1.getString(2));
			}
			System.out.println("Enter centerId name:");
			int centerid=sc.nextInt();
			pstm=con.prepareStatement("select * from slot  where slotid not in( select slotid from vaccination_info  where centerid=?)");
			pstm.setInt(1, centerid);
			ResultSet sl=pstm.executeQuery();
			while(sl.next()){
				System.out.println(sl.getInt(1)+"\t"+sl.getString(2));
			}
			System.out.println("Enter slotId ");
			int slotid=sc.nextInt();
			System.out.println("Enter userid,name,dob(yyyy/mm/dd)"
					+ "\nadhar(16), age,contact");
			int uid=sc.nextInt();
			String uname=sc.next();
			String dob=sc.next();
			String adhar=sc.next();
			int age=sc.nextInt();
			String c=sc.next();
			pstm=con.prepareStatement("insert into user_info values(?,?,?,?,?,?)");
			pstm.setInt(1, uid);
			pstm.setString(2, uname);
			pstm.setString(3, dob);
			pstm.setString(4, adhar);
			pstm.setInt(5, age);
			pstm.setString(6, c);
			int i=pstm.executeUpdate();
			if(i!=0)
				System.out.println(i+" row inserted");
			else
				System.out.println("not inserted");
			pstm=con.prepareStatement("insert into vaccination_info(userid,centerid,cityid,"
					+ "slotid,booking_date,Dose_1) values (?,?,?,?,?,?)");
			System.out.println("cityid,dose_1 date");
			int cityid=sc.nextInt();
			String d1=sc.next();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String bdate = sdf.format(new Date()); 
		
			pstm.setInt(1, uid);
			pstm.setInt(2, centerid);
			pstm.setInt(3, cityid);
			pstm.setInt(4, slotid);
			pstm.setString(5, bdate);
			pstm.setString(6, d1);
			int j=pstm.executeUpdate();
			if(j!=0)
				System.out.println(j+" row inserted");
			else
				System.out.println("not inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void display(Connection con){
		System.out.println("enter user name:");
		String uname=sc.next();
		System.out.println("Name"+"\t"+"center_name"+"\t"+"City"+"\t"+"Time"+"Vaccine Name"+"\t"+"Dose-1 Date");
		try {
			pstm=con.prepareStatement("select u.uname Name,c.center_name,"
					+ "ct.cname City,s.slot_time Time,v.vaccine_name 'Vaccine Name',"
					+ "v.dose_1 'Dose-1 Date' from vaccination_info v,center c, city ct,"
					+ "slot s,user_info u"+" where v.userid=u.userid and"
					+ " v.centerid=c.centerid and v.slotid=s.slotid and "
					+ "v.cityid=ct.cityid and u.uname like ? ");
			pstm.setString(1, uname);
			ResultSet rs=pstm.executeQuery(); 
			while(rs.next()){
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
			}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
