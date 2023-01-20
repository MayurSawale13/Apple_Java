package comparator_comparable;

public class Student {
	public int rollno,age;
	public String name;
	public Student (int roll,int age,String name){
		this.rollno=roll;
		this.age=age;
		this.name=name;
	}
	public String toString(){
		return rollno+" "+name+" "+age;
	}
}
