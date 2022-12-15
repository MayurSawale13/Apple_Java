package arrays;

public class Movie {
 private int mid,roy;
 private String mname;
 public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public int getRoy() {
	return roy;
}
public void setRoy(int roy) {
	this.roy = roy;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}

 
/* Movie(int mid,int roy,String mname)
 {
	 this.mid=mid;
	 this.roy=roy;
	 this.mname=mname;
 }*/
 public Movie() {
	// TODO Auto-generated constructor stub
}
public String toString()
	{
		return "Movie ID:"+mid+" Realese Year:"+roy+" Movie Name:"+mname;
	}
}
