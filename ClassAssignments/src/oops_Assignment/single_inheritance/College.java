package oops_Assignment.single_inheritance;

class College {
	void display(){
		System.out.println("parent class");
	}

}
class Student extends College{
	void display(){
		System.out.println("Child Class");
	}
}