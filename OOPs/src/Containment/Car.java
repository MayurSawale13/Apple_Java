package Containment;

public class Car {
private int id,price;
private String color;
private Engine e;
Car(int id,int price,String color,Engine e)
{
	this.id=id;
	this.price=price;
	this.color=color;
	this.e=e;
}
public String toString()
{
	return "\nid: "+id+" price: "+price+" color: "+color;
}
/*public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Engine getE() {
	return e;
}
public void setE(Engine e) {
	this.e = e;
}*/
}
