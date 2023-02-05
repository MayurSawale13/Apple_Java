package library_mgmt_arraylist;

public class Book {
	int bid,copy_no;
	String bname,author;
	
	public Book(int bid,int copy_no,String bname,String author){
		this.bid=bid;
		this.bname=bname;
		this.author=author;
		this.copy_no=copy_no;
	}
	public String toString(){
		return bid+" "+bname+" "+author+" "+copy_no;
	}
}
