package library_mgmt_arraylist;

public class Transaction {
	Student s;
	Book b;
	String idate,rdate;
	
	Transaction(Student s,Book b,String idate,String rdate){
		this.s=s;
		this.b=b;
		this.idate=idate;
		this.rdate=rdate;
	}
	public String toString(){
		return s+" "+b+" "+idate+" "+rdate;
	}
	

}
