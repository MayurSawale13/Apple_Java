package extra_prep;

import java.util.Arrays;
import java.util.HashMap;

/*write a Java program to convert the below string into array of objects, in the below example the code should generate three objects of Student. Data is been separated by, (comma) and fields are separated by & (ampersand). If the fields
have multiple data then it has been separated by | (pipe).
"name-ram, sita, laxman&age-24,21,188subject-maths|physics/science, maths science, english"
string student-
Structure
class Name : Student
string name
int age
string[] subjects
Loop the created array objects and print the data.*/
public class Create_GlobalVar_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 []stud=new Student1 [3];
		String s="name=ram,sita,lakshiman&age=24,21,18&subject=maths|physics|secince,math|science,english";
		String s1[]=s.split("&");
		System.out.println(Arrays.toString(s1));
	
		
		
		HashMap<String,String> hm=new HashMap<>();
		for(String x:s1){
			String s2[]=x.split("=");
			if(!hm.containsKey(s2[0])){
				hm.put(s2[0], s2[1]);
			}
		}
		System.out.println(hm.get("subject"));
		String [] sub=hm.get("subject").split(",");
		String []names=hm.get("name").split(",");
		System.out.println(names.length);
		String []ages=hm.get("age").split(",");
		
		String sub1[]=sub[0].split("\\|");
		System.out.println(Arrays.toString(sub));
		Student1 d1=new Student1(names[0],Integer.parseInt(ages[0]),sub1);
		stud[0]=d1;
		sub1=sub[1].split("\\|");
		stud[1]=new Student1(names[1],Integer.parseInt(ages[1]),sub1);
		sub1=sub[2].split("\\|");
		stud[2]=new Student1(names[2],Integer.parseInt(ages[2]),sub1);
		System.out.println(d1);
	    System.out.println(Arrays.toString(stud));
	}

}
