package august_final_test;

import java.util.Arrays;

public class Project {
	private int pid;
	private String pname;
	private Student sarr[];
	public Project(){
		
	}
	public Project(int pid,String pname,Student sarr[]){
		this.setPid(pid);
		this.setPname(pname);
		this.setSarr(sarr);
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Student[] getSarr() {
		return sarr;
	}
	public void setSarr(Student sarr[]) {
		this.sarr = sarr;
	}
	public String toString(){
		return pid+" "+pname+" "+Arrays.toString(sarr);
	}

}
