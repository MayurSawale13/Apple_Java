package arrays_object;

public class EmployeeObjectArray {
		int empId,salary;
		String name;
		DateEmployee d;
	EmployeeObjectArray(int empId,int salary,String name,DateEmployee d)
	{
		this.empId=empId;
		this.salary=salary;
		this.name=name;
		this.d=d;
	}
	public String toString ()
	{
		return "Emp Id:"+empId+" salary:"+salary+" Emp Name:"+name+"\nDate of Joining:"+d.day+"-"+d.month+"-"+d.year;
	}
	public static void main(String[] args) {
		EmployeeObjectArray emp[]=new EmployeeObjectArray[2];
		
		DateEmployee d1=new DateEmployee(12,12,2020);
		DateEmployee d2=new DateEmployee(05,12,2021);
		emp[0]=new EmployeeObjectArray(1,25000,"mayur",d1);
		emp[1]=new EmployeeObjectArray(2,30000,"akhil",d2);
		for(int i=0;i<emp.length;i++){
		System.out.println(emp[i]);
		}
	}

}
