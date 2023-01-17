package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderMain {
	
	void addEle(ArrayList<Order> al)
	{
		al.add(new Order(160,6000,new OrderStatus("25/12/2022","delivered")));
		al.add(new Order(14,500,new OrderStatus("19/01/2023","pending")));
		al.add(new Order(51,7500,new OrderStatus("30/12/2022","delivered")));
		al.add(new Order(61,8400,new OrderStatus("16/12/2022","delivered")));
		al.add(new Order(20,9050,new OrderStatus("25/01/2023","pending")));
		al.add(new Order(47,8380,new OrderStatus("20/01/2023","pending")));
		al.add(new Order(76,6350,new OrderStatus("24/12/2022","delivered")));
		al.add(new Order(34,9540,new OrderStatus("26/01/2023","pending")));
		
	}
	void createHashMap(HashMap<String,Integer> hm,ArrayList<Order> al)
	{
		for(Order o:al)
		{
			if(hm.containsKey(o.s.status))
			{
				
				hm.put(o.s.status, hm.get(o.s.status)+1);
			}
			else
				hm.put(o.s.status, 1);
		}
	}

	public static void main(String[] args) {
		ArrayList<Order> al=new ArrayList<>();
		HashMap<String,Integer> hm=new HashMap<>();
		OrderMain o=new OrderMain();
		o.addEle(al);
		o.createHashMap(hm, al);
		System.out.println(hm);
	}

}
