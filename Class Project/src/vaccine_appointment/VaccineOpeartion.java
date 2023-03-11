package vaccine_appointment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class VaccineOpeartion {
	Scanner sc = new Scanner(System.in);
	PreparedStatement pstm;
	public Connection con1;

	public boolean checkHoliday(Connection con, String d) {
		ResultSet rs;
		boolean b = false;
		try {
			pstm = con.prepareStatement("select * from holiday where hdate=?", ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			pstm.setString(1, d);
			rs = pstm.executeQuery();
			b = rs.first();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	public boolean checkWeekend(Connection con, String d) {
		ResultSet rs;
		boolean da = false;
		String day = null;
		try {
			pstm = con.prepareStatement("select dayname(?)");
			pstm.setString(1, d);
			rs = pstm.executeQuery();

			while (rs.next()) {
				day = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday"))
			da = true;
		return da;
	}

	public int user_info(Connection con) {
		PreparedStatement pstm1;
		System.out.println("Enter user name,dob(yyyy-mm-dd)" + "\nadhar(16), age,contact");
		int uid = 0;
		String uname = sc.next();
		String dob = sc.next();
		String adhar = sc.next();
		int age = sc.nextInt();
		String c = sc.next();
		try {
			pstm1 = con.prepareStatement("insert into user_info(uname,dob,adhar,age,contact) values(?,?,?,?,?)");
			pstm1.setString(1, uname);
			pstm1.setString(2, dob);
			pstm1.setString(3, adhar);
			pstm1.setInt(4, age);
			pstm1.setString(5, c);
			int i = pstm1.executeUpdate();
			if (i != 0)
				System.out.println(i + " row inserted");
			else
				System.out.println("not inserted");
			pstm1.close();
			pstm1 = con.prepareStatement("select * from user_info where uname=?");
			pstm1.setString(1, uname);
			ResultSet rs = pstm1.executeQuery();
			while (rs.next()) {
				uid = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return uid;

	}

	public int cityDisplay(Connection con) {
		int cid = 0;
		try {
			pstm = con.prepareStatement("select * from city");

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
			}
			System.out.println("Enter city name:");
			String cname = sc.next();
			pstm = con.prepareStatement("select cityid from city where cname=?");
			pstm.setString(1, cname);
			rs = pstm.executeQuery();
			while (rs.next()) {
				cid = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cid);
		return cid;
	}

	public int centerDisplay(Connection con, int cid) {

		int centerid = 0;
		try {
			pstm = con.prepareStatement("select c.* from center c where cityid=?");

			pstm.setInt(1, cid);
			ResultSet rs1 = pstm.executeQuery();
			while (rs1.next()) {
				System.out.println(rs1.getInt(1) + "\t" + rs1.getString(2));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter centerId name:");
		centerid = sc.nextInt();
		return centerid;
	}

	public int slotDisplay(Connection con, int cid, int centerid, String bdate) {
		try {
			pstm = con.prepareStatement(
					"select * from slot  where slotid not in( select slotid from vaccination_info  where centerid=? and cityid=? and booking_date=?)");
			pstm.setInt(2, cid);
			pstm.setInt(1, centerid);
			pstm.setString(3, bdate);
			ResultSet sl = pstm.executeQuery();
			while (sl.next()) {
				System.out.println(sl.getInt(1) + "\t" + sl.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// pstm.close();
		System.out.println("Enter slotId ");
		int slotid = sc.nextInt();
		return slotid;
	}

	public void appointment(Connection con) {

		try {
			PreparedStatement pstm1;
			pstm1 = con.prepareStatement("insert into vaccination_info(userid,centerid,cityid,"
					+ "slotid,booking_date,Dose_1) values (?,?,?,?,?,?)");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String bdate = sdf.format(new Date());
			int cityid = cityDisplay(con);
			int centerid = centerDisplay(con, cityid);
			int slotid = slotDisplay(con, cityid, centerid, bdate);
			System.out.println("dose_1 date");
			String d1 = sc.next();
			while(checkHoliday(con, d1) || checkWeekend(con, d1)) {
				System.out.println("Closed on weekends and public holiday \nenter another date ");
				System.out.println("dose_1 date");
				 d1 = sc.next();
			}
				int uid = user_info(con);
				pstm1.setInt(1, uid);
				pstm1.setInt(2, centerid);
				pstm1.setInt(3, cityid);
				pstm1.setInt(4, slotid);
				pstm1.setString(5, bdate);
				pstm1.setString(6, d1);
				int j = pstm1.executeUpdate();
				if (j != 0)
					System.out.println(j + " row inserted");
				else
					System.out.println("not inserted");
				display(con, uid);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void display(Connection con, int uid) {
		try {
			pstm = con.prepareStatement("select u.uname Name,c.center_name,"
					+ "ct.cname City,s.slot_time Time,v.vaccine_name 'Vaccine Name',"
					+ "v.dose_1 'Dose-1 Date',v.dose_2 'Dose-2 Date' from vaccination_info v,center c, city ct,"
					+ "slot s,user_info u" + " where v.userid=u.userid and"
					+ " v.centerid=c.centerid and v.slotid=s.slotid and " + "v.cityid=ct.cityid and u.userid=?");
			pstm.setInt(1, uid);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				System.out.println("Thank you,Your Appointment details : ");
				System.out.println("Name: " + rs.getString(1) + "\n" + "Center Name: " + rs.getString(2) + "\n"
						+ "Center Name:" + rs.getString(3) + "\n" + "Time: " + rs.getString(4) + "\n" + "Vaccine Name: "
						+ rs.getString(5) + "\n" + "Dose 1 Date:" + rs.getString(6) + "\n" + "Dose-2 Date: "
						+ rs.getString(7));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
