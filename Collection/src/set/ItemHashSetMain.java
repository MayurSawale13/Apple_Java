package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class ItemHashSetMain {
	void addEle(HashSet<Item> hs) {
		hs.add(new Item(12, 35, 2, "pen"));
		hs.add(new Item(5, 600, 1, "book"));
		hs.add(new Item(3, 50, 2, "sugar"));
		hs.add(new Item(4, 55, 1, "rice"));
		hs.add(new Item(8, 350, 1, "tshirt"));
		hs.add(new Item(16, 24, 1, "wheat"));
		hs.add(new Item(17, 960, 1, "shoes"));
		hs.add(new Item(17, 960, 1, "shoes"));
	}

	public static void main(String[] args) {
		HashSet<Item> hs = new HashSet<>();
		// TreeSet<Item> ts=new TreeSet<>();
		ItemHashSetMain i = new ItemHashSetMain();
		i.addEle(hs);
		System.out.println(hs);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id and itemName to change");
		int id = sc.nextInt();
		String name = sc.next();
		for (Item x : hs) {
			if (x.id == id) {
				x.name = name;
			}
		}
		System.out.println(hs);
	}

}
