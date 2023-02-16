package august_final_test;

public class Test implements Comparable<Test>{
	int tid,sid,marks;
	public Test(int tid,int sid,int marks){
		this.tid=tid;
		this.sid=sid;
		this.marks=marks;
	}
	public String toString(){
		return tid+" "+sid+" "+marks;
	}
	public int compareTo(Test t){
		if(this.marks<t.marks)
			return 1;
		else if (this.marks>t.marks)
			return -1;
		else
			return 0;
	}

}
