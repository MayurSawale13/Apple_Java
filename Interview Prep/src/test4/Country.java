package test4;

public class Country implements Cloneable{
	public int cid;
	public String name;
	public Country(int cid,String name){
		this.cid=cid;
		this.name=name;
	}
	public String toString(){
		return cid+" "+name;
	}
public Object clone() throws CloneNotSupportedException{
		 Country c1=(Country) super.clone();
		return c1;
}
}
