package arrays;

import java.util.Arrays;

public class Theatre {
	int tid;
	String name;
	Movie m[];
	Theatre(int tid,String name,Movie m[])
	{
		this.tid=tid;
		this.name=name;
		this.m=m; 
	}
	public String toString()
	{
		return "theatre id:"+tid+" Theatre name:"+name+Arrays.toString(m);
	}

}
