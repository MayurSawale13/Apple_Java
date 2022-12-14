package arrays;

public class Movie {
 int mid,roy;
 String mname;
 Movie(int mid,int roy,String mname)
 {
	 this.mid=mid;
	 this.roy=roy;
	 this.mname=mname;
 }
 public String toString()
	{
		return "Movie ID:"+mid+" Realese Year:"+roy+" Movie Name:"+mname;
	}
}
