package arrays_object;

import java.util.Arrays;

public class Person {
	int pid;
	String pname,address;
	
	Idproof id[];
	
	public Idproof[] getId() {
		return id;
	}
	public void setId(Idproof[] id) {
		this.id = id;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString()
	{
		return " person id:"+pid+" pName:"+pname+" pAddress"+address+Arrays.toString(id);
	}

}
