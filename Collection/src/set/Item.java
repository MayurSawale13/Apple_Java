package set;

public class Item implements Comparable<Item>{
int id,price,quantity;
String name;
Item(int id ,int price,int quantity,String name){
	this.id=id;
	this.price=price;
	 this.quantity=quantity;
	 this.name=name;
}
public String toString()
{
	return id+" "+price+" "+quantity+" "+name;
}
public int hashCode(){
	return id;
}
public boolean equals(Object o){
	Item t=(Item) o;
	if(this.id==t.id)
		return true;
	else 
		return false;
}
public int compareTo(Item o){
	return this.name.compareTo(o.name);
}

}
