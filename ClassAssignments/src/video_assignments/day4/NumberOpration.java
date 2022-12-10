package video_assignments.day4;

public class NumberOpration {
	//
	/*
	 * public void addNumber(int a,int b,float c){
	 * System.out.println("Addition:"+(a+b+c)); } public int addNumber(int a,int
	 * b){ return a+b; } void addNumber(int a,float z) {
	 * System.out.println("Addtion :"+(a+z)); }
	 */

	public int area(int a, int b) {
		return a * b;
	}

	void area(float a, float b) {
		System.out.println("area of triangle " + (0.5 * a * b));
	}

	public void area(float b) {
		System.out.println("area of circle " + (3.1412 * b * b));
	}
}
