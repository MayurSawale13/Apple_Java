package arrays_object;

import java.util.Arrays;

public class Department {
	int did;
	String name;
	Student s[];

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student[] getS() {
		return s;
	}

	public void setS(Student[] s) {
		this.s = s;
	}

	public String toString() {
		return "Dept Id:" + did + "Dept Name:" + name + Arrays.toString(s);
	}

}
