package strings_assignments;

import java.util.Scanner;

public class DuplicateCharInput {
	void duplicate(String s){
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String s=sc.next();
		DuplicateCharInput d=new DuplicateCharInput();
		d.duplicate(s);

	}

}
