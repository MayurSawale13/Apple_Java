package interface_assignments;

interface Cake {
	void bake();
}
class Strawberry implements Cake{
	public void bake()
	{
		System.out.println("Baking Strawberry Cake");
	}
}
class Chocolate implements Cake{
	public void bake(){
		System.out.println("Baking Chocolate Cake");
	}
	
}