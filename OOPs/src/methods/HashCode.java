package methods;

public class HashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(); 
		Student s2=new Student();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Hashcode of s1:"+s1.hashCode());
		System.out.println("Hashcode of s1:"+s2.hashCode());
		System.out.println("------------after s2=s1-----");
		s2=s1;
		System.out.println("Hashcode of s1:"+s1.hashCode());
		System.out.println("Hashcode of s1:"+s2.hashCode());
		System.out.println("-----after ToString method----");
		System.out.println(s1);
	}

}
