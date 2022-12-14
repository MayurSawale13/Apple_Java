package arrays;

import java.util.Arrays;

public class Company {
	int id;
	String name;
	Department d[];

	Company(int id, String name, Department d[]) {
		this.id = id;
		this.name = name;
		this.d = d;

	}

	public String toString() {
		return "Comp Id:" + id + " name:" + name + Arrays.toString(d);
	}

}
