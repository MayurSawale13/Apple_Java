package strings;

public class Middle {

	public static void main(String[] args) {
		String s[]={"aabaaba","bbaabb","abbab","aaabbb","abbbbabbb"};
		int countb=0;
		for(int i=0;i<s.length;i++){
			String s1=s[i];
		
				int mid =s1.length()/2;
				char m=s1.charAt(mid);
				
				String s2=s1.substring(0,mid);
				System.out.println(s2);
				String s3=s1.substring(mid+1,s1.length());
				System.out.println(s3);
				int countl=0,countr=0;
				for(int j=0;j<s2.length();j++){
					if(s2.charAt(j)==m)
						countl++;
				}
					for(int j=0;j<s3.length();j++){
						if(s3.charAt(j)==m)
							countr++;
				}
					if(countl==countr)
						countb++;
					
		}

		System.out.println(countb);
	}

}
