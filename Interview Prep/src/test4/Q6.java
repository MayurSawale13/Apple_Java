package test4;

/*6. Cart class is as follows cart { int itemno , String name , int qty , int rate }
Take input from user to create cart object. Assign values to car object using parameterised
constructor.
If total price of item is > 1000 give discount of 100 rs. If total price is > 900 discount is
= 80 . if total price is > 600 check if itemno is 111 give discount 50 rs if price is > 600 and item
is not 111 discount is 40. For all others discount is 20 .
Using ternary operator find out discount. Display discount. Total price is qty * rate. */
public class Q6 {
	void discount(Cart c) {
		double discount = 0;
		int price = (c.rate);
		System.out.println("amount before discount:" + price);

		discount = price > 1000 ? 100
				: price > 900 ? 80 : price > 600 && c.itemno == 111 ? 50 : (double) (price > 600 ? 40 : 20);

		System.out.println("amount after discount:" + (price - discount));
	}

	public static void main(String[] args) {
		Q6 obj = new Q6();
		Cart c = new Cart(111, "shoes", 1200, 2);
		obj.discount(c);
	}
}
