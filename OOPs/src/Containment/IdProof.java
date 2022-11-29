package Containment;

public class IdProof {
	int idno;
	String name,address;
	IdProof(int idno,String name,String address){
		this.idno=idno;
		this.name=name;
		this.address=address;
		
	}
public String toString()
{
	return "Id Number:"+idno+"Id name:"+name+"Address:"+address;
}
}
