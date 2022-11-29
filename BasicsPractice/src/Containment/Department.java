package Containment;

public class Department {
	int d_id;
	String dname;
	public Department(int did,String n){
		d_id=did;
		dname=n;
	}
	public String toString()
	{
		return "Department Id:"+d_id+" Department name:"+dname;
	}

}
