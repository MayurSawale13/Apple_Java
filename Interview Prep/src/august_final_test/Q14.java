package august_final_test;

import java.util.Arrays;

/*14.Reverse middle words of a string [1M]
Given a string str, print reverse all words except the first 
and last words.

Examples:
Input  : Hi how are you students 
Output  : Hi woh era uoy students
Input : I am fine
Output : I ma fine*/
public class Q14 {
	void output(String s){
		String mid_rev="";
		String rev[]=s.split(" ");
		for(int i=0;i<rev.length;i++){
			if(i==0 ||i==rev.length-1)
				continue;
			String x=rev[i];
		
			char[] r=new char[x.length()];
			int k=0;
			for(int j=x.length()-1;j>=0;j--){
				r[k]=x.charAt(j);
				k++;
			}
			rev[i]=new String(r);
		}
		for(String x:rev){
			mid_rev=mid_rev+x+" ";
		}
		System.out.println(mid_rev);
	}
	public static void main(String[] args) {
		String s1="Hi how are you students ";
		String s2="I am fine";
		Q14 d=new Q14();
		d.output(s2);

	}

}
