package map_assignment;

public class Item {
	int id,price,q;
	String name;
Item(int id,String name,int q,int price){
	this.id=id;
	this.price=price;
	this.q=q;
	this.name=name;
}
public String toString(){
	return id+" "+name+" "+q+" "+price;
}
}
