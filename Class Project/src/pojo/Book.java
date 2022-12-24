package pojo;

public class Book {
	private int id, copyno;
	private String name, author;
	public Book(int id,int copyno,String name,String author){
		this.id=id;
		this.copyno=copyno;
		this.name=name;
		this.author=author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCopyno() {
		return copyno;
	}

	public void setCopyno(int copyno) {
		this.copyno = copyno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public String toString(){
		return "Book Id:"+id+" Name:"+name+" Author:"+author+" NoOfCopy:"+copyno;
	}

}
