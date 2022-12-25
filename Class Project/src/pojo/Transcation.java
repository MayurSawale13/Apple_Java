package pojo;

public class Transcation {
	private Studen s;
	private String  bname;
	private Book  bk;
	
	private String issueDate,returnDate;
	private boolean bookIssue;
	public Studen getS() {
		return s;
	}

	public void setS(Studen s) {
		this.s = s;
	}

	
	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}
	public String toString(){
		return " BookName:"+bname+" IssueDate:"+issueDate+" ReururnDate"+returnDate;
	}

	public boolean isBookIssue() {
		return bookIssue;
	}

	public void setBookIssue(boolean bookIssue) {
		this.bookIssue = bookIssue;
	}

	public Book getBk() {
		return bk;
	}

	public void setBk(Book bk) {
		this.bk = bk;
	}
	
}
