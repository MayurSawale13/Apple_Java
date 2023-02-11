package test4;

public class Cart {
	public int itemno,rate,qty;
	public String name;
	public Cart(int item,String name,int rate,int qty){
		this.itemno=item;
		this.rate=rate;
		this.name=name;
		this.qty=qty;
		
	}
	public String toString (){
		return itemno+" "+name+" "+qty+" "+rate;
		
	}

}
