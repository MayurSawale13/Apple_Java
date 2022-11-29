package Containment;

public class College {
	private int code;
	private String name,addy;
	private Depart d;Student s;
	public void setDepart(Depart d)
	{
		this.d=d;
	}
	public Depart getDepart()
	{
		return d;
	}
	public void setStudent(Student s)
	{
		this.s=s;
	}
	public Student getStudent()
	{
		return s;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddy() {
		return addy;
	}
	public void setAddy(String addy) {
		this.addy = addy;
	}
	public String toString(){
		return "Coll Code: "+code+" Coll name: "+name+" Address: "+addy;
	}
}
