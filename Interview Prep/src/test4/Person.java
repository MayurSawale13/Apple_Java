package test4;

public class Person implements Cloneable{
	private int salary;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String name,address;

	public String toString(){
		return salary+" "+name+" "+address;
	}
	public Object clone() throws CloneNotSupportedException{
		Person p=(Person)super.clone();
		return p;
	}

}
