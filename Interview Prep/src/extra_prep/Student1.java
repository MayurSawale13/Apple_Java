package extra_prep;

import java.util.Arrays;

public class Student1 {
	 String name;
	 int age;
	 String [] sub;
	 Student1(String n,int age,String [] sub){
		 this.name=n;
		 this.age=age;
		 this.sub=sub;
	 }
	
	public String toString(){
		return name+" "+age+" "+Arrays.toString(sub);
	}

}
