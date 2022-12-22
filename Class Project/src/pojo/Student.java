package pojo;

import java.util.Arrays;

public class Student {
	private int mark[];
	private int id;
	private String name, email, contact, dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int[] getMark() {
		return mark;
	}

	public void setMark(int mark[]) {
		this.mark = mark;
	}

	public String toString() {
		return "Student Id: " + id + " Name:" + name + " Email:" + email + " Contact:" + contact + " Dept: " + dept
				+ "\nMarks: " + Arrays.toString(mark);
	}
}
