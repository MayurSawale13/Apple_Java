package stacknqueue;

import java.util.Stack;

public class StackEx {
	void addEle(Stack<Integer> s){
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(70);
	}

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		StackEx g=new StackEx();
	}

}
