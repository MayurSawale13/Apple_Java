package library_mgmt_arraylist;

public class Student {

	int sid;
	String sname,contact,dept;
	
	Student(int sid,String sname,String contact,String dept){
		this.sid=sid;
		this.sname=sname;
		this.contact=contact;
		this.dept=dept;
	}
	public String toString(){
		return sid+" "+sname+" "+contact+" "+dept;
	}
}
