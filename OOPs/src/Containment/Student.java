package Containment;

public class Student {
 private int id;
 private String sname;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String toString()
{
	return "Student Id: "+id+" Name: "+sname;
}

}
