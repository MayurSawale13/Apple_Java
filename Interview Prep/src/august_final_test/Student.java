package august_final_test;

public class Student {
	int sid,total_marks;
	public Student(int sid,int t){
		this.sid=sid;
		this.total_marks=t;
	}
	public String toString(){
		return sid+" "+total_marks;
	}

}
