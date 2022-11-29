package polymorphism;

public class Addition {
	public void add(int a,int b){//diff no parameter
		System.out.println("addition of (int,int): "+(a+b));
	}
	public void add(float a,int b){// diff seq of parameter
		System.out.println("addition of (float,int): "+(a+b));
	}
	
	public void add(int a,int b,int c){//diff no parameter
		System.out.println("addition of (int,int,int): "+(a+b+c));
	}
	public void add(int a,int b,float c){
		System.out.println("addition: "+(a+b+c));
	}
	public void add(float c,int a,int b){//diff seq of parameter
		System.out.println("addition: "+(a+b));
	}
	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(1, 2);
		a.add(3.5f, 5);
	}
}
