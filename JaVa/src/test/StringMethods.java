package test;

public class StringMethods {

	public static final String s = "Navatha Kannadi";

	/*
	 * charAT returns the character located at specific Index(Index starts from
	 * "Zero") If index is above the range of string,will throw
	 * StringIndexOutOfBoundsException
	 */
	public static void charAtMethod() {
		char x = s.charAt(12);
		System.out.println(s.charAt(10));
		System.out.println(x);
	}

	/*
	 * String concatenation can be done in different ways:1.concat Method 2.+
	 * operator 3. += operators If index is above the range of string,will throw
	 * StringIndexOutOfBoundsException
	 */
	public static void concatMethod() {
		String concatedValue = s.concat(" the");
		System.out.println(concatedValue);
		String operatorPlus = concatedValue + " Great ";
		System.out.println(operatorPlus);
	}

	/*
	 * equals method in String is for content comparison with case
	 * sensitive(generally used to validate the User name) equals method in String
	 * is for content comparison with case sensitive(generally used to validate the
	 * Password) If index is above the range of string,will throw
	 * StringIndexOutOfBoundsException
	 */
	public static void equals() {
		String s2 = "NAVATHA KANNADI";
		System.out.println(s2.equals(s));
		System.out.println(s2.equalsIgnoreCase(s));
	}

	/*
	 * subString(int index) - method returns the part of the string from mentioned
	 * Begin Index to end of the String subString(int BeginIndex,int EndIndex) -
	 * method returns the part of the string between mentioned BeginIndex and
	 * EndIndex-1
	 */
	public static void subStringMethos() {
		String s2 = s.substring(5);
		System.out.println(s2);
		String s3 = s.substring(1, 10);
		System.out.println(s3);
	}

	/*
	 * Length returns the integer count of number of characters present in the
	 * string
	 */
	public static void lenghthMethod() {
		System.out.println(s.length());

	}

	/*
	 * replace(oldChar,newChar) method replaces old characters with newly specified
	 * characters
	 * 
	 */
	public static void replaceMethod() {
		System.out.println(s.replace('a', 'd'));
	}

	/*
	 * toUpperCase and toLowerCase methods converts the given string to Upper case
	 * and Lower case characters respectively
	 */
	public static void toUpper_LowerCaseMethod() {
		String s1 = new String("navatha");
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		String s3 = s2.toLowerCase();
		System.out.println(s3);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
	}

	/*
	 * trim() method removes the blank spaces beginning and end of the String but
	 * not middle blank spaces
	 */
	public static void trimMethod() {
		String s1 = "  Navatha Kannadi  ";
		System.out.println(s1.trim());
	}

	/*
	 * public int indexOf(Char ch) method returns the index of first occurrence of
	 * the specified character public int lastIndexOf(char ch) method returns the
	 * index of last occurrence of the specified character
	 */
	public static void indexOfMethod() {
		System.out.println(s.indexOf('K'));
		System.out.println(s.lastIndexOf('a'));
	}

	public static void main(String args[]) {
		/*
		 * charAtMethod(); concatMethod(); equals(); subStringMethos(); lenghthMethod();
		 * 
		 * replaceMethod(); toUpper_LowerCaseMethod(); trimMethod(); indexOfMethod();
		 */
		toUpper_LowerCaseMethod();
	}

}
