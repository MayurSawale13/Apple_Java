package extra_prep;

public class Student extends Person {
	int id,marks;
	String dept;
	
	Student(){
		
	}
	void setDataStudent(int id,int marks,String dept){
		this.id=id;
		this.marks=marks;
		this.dept=dept;
	}
	void grade(){
		String grade;
		if(marks>70){
			grade="A";
		}
		else if(marks<70 && marks>60){
			grade="B";
		}
		else if(marks>60 && marks>35){
			grade="C";
		}
		else
			grade="fail";
		System.out.println("grade :"+grade);
	}
	
	void display(){
		//String g=grade();
		System.out.println(id+" "+name+" "+dept+" "+contact+" "+marks);
	}
	public static void main(String[] args) {
		Student p=new Student();
		p.setData("pune","akhil","78654578",24);
		p.setDataStudent(1,80,"computer");
		p.grade();
		p.display();
	}
}
