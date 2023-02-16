package extra_prep;

import java.util.ArrayList;

public class Company {
	int cid;
	String name;
	ArrayList<Plane> p;
	public Company(int cid,String name,ArrayList<Plane> p){
		this.cid=cid;
		this.name=name;
		this.p=p;
		}
	
	public String toString(){
		return cid+" "+name+" "+p;
	}
	

}
