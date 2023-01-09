package list;

import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> cp=new CopyOnWriteArrayList<>();
		cp.add(10);
		cp.add(80);
		cp.add(60);
		cp.add(20);
		cp.add(50);
		cp.add(60);
		cp.add(10);
		

	}

}
