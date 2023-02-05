package pojo;

public class Emp {
	public int id;
	public float salary;
	public String name, dept;

	public Emp(int id, String name, String dept, float sal) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = sal;
	}

	public String toString() {
		return id + " " + name + " " + dept + " " + salary;
	}

}
