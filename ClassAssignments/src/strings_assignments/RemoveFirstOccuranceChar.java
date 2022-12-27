package strings_assignments;

public class RemoveFirstOccuranceChar {

	public static void main(String[] args) {
		String s= "Thinqquetiont is java is instistute";
		//String replace first
		String s1=s.replaceFirst("q", "");
		System.out.println(s1);
		String s2="is";
	  char ch='q';
	  //2.String bulider indexof:
	  StringBuilder sb=new StringBuilder(s);
	  int i1=s.indexOf(ch);
	  sb.deleteCharAt(i1);
	  System.out.println(sb);
	  
	  //3.using substring:
	  String s3="";
	  for(int i=0;i<s.length();i++)
	  {
		  if(s.charAt(i)=='q')
		  {
			  s3=s.substring(0, i)+s.substring(i+1);
			  break;
		  }
	  }
	  System.out.println(s3+"2 ");
	}
	
}
