package comparator_comparable;

/*3-9.WAP to create a class Employee with 
(name, designation and age).Now create and add 
Employee objects elements to Arraylist.
Print ArrayList.*/
public class Employee implements Comparable<Employee>{
	int id, age;
	String name, dept;

	Employee(int id, int age, String name, String dept) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.dept = dept;
	}

	public String toString() {
		return id + " " + name + " " + dept + " " + age;
	}
	public int compareTo(Employee o){
		if(this.name.compareTo(o.name)==0)
		{
		if(this.id>o.id)
			return 1;
		else if(this.id<o.id)
			return -1;
		else
			return 0;
		}
		else
			return this.name.compareTo(o.name);
		}
}
