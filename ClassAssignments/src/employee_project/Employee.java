package employee_project;

public class Employee {
	private int id;
	private float salary;
	private String name, dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {
		return "Emp id: " + id + " Emp name: " + name + " Emp Salary: " + salary + " Emp Dept:" + dept;
	}

}
