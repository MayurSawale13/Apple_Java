package august_final_test;

import java.util.ArrayList;

public class S_Members {
	int mid;
	String wing_flatNo;
	ArrayList<String> names;
	public S_Members(int mid,String w,ArrayList<String> names){
		this.mid=mid;
		this.wing_flatNo=w;
		this.names=names;
	}
	public String toString(){
		return mid+" "+wing_flatNo+" "+names;
	}

}
