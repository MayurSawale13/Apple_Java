package video_assignments.day3;

 public class Student {
	
	int studentId;
	String name;
		void getId(int id,String n)
	{
		studentId=id;
		name=n;
	}
		void displayData(){
			getId(studentId,name);
		System.out.println("Student Id: " +studentId);
		System.out.println("Student Name :" +name);
		
	}


			
	public static void main(String[] args) {
		Student obj1=new Student();
		//Student obj2=new Student();
		obj1.getId(1, "adarsh");
		//obj2=obj1;
		obj1.displayData();
		//System.out.println(obj1.studentId +obj1.name);
		 

	}

}
