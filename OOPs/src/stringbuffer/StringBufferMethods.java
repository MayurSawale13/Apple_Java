package stringbuffer;

public class StringBufferMethods {

	public static void main(String[] args) {
			StringBuffer sb=new StringBuffer("hello");
			//capacity of sb(size)
			System.out.println(sb.capacity());
			//ensure capcity:min capacity (current cap*2)+2
			sb.ensureCapacity(20);
			//16*2+2
			System.out.println(sb.capacity());
			//append
			sb.append("world");
			System.out.println(sb);
			//replace
			sb.replace(1, 3, "ola!");
			System.out.println(sb);
			//sb.reverse();
			//System.out.println(sb);
			sb.delete(1, 3);
			System.out.println(sb);
			System.out.println(sb.subSequence(1, 5));
			String s=sb.substring(5);
			System.out.println(s);
			
				sb.delete(1,5);
			
			System.out.println(sb);
			
	}

}
