package oops_basic;

public class Shopping {
	String itemname;
	float price,bill;
	int quantity;
	void acceptDetails(String s,float p,int q)
	{
		itemname=s;
		price=p;
		quantity=q;
		
	}
	void calculateBill( )
	{
		 bill=price*quantity;
		
	}
	void display()
	{
		calculateBill();
		System.out.println("Item Name: " +itemname+"\nItem Price: "+price+"\nQuantity: "+quantity);
		System.out.println("Total bill: "+bill);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping s=new Shopping();
		s.acceptDetails("shirt", 150.0f, 0);
		if(s.quantity>0)	
		s.display();
		else
		System.out.println("Quantity is < 0");

	}

}
