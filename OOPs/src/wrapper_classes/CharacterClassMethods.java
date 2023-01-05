package wrapper_classes;

public class CharacterClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c='5';
		System.out.println(Character.isDigit(c));
		System.out.println(Character.isLetter(c));
		System.out.println(Character.isLowerCase(c));
		System.out.println(Character.isUpperCase(c));
		System.out.println(Character.isWhitespace(c));
		System.out.println(Character.isJavaIdentifierPart(c));
		System.out.println(Character.isJavaLetterOrDigit(c));
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.compare(40, 50));
		System.out.println(Integer.max(10, 5));
		
	}

}
