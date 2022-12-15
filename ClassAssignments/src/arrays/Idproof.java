package arrays;

public class Idproof {
	int id;
	String name,validity;
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
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String toString()
	{
		return "proof id:"+id+" Name:"+name+" validity:"+validity;
	}

}
