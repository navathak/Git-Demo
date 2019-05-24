package test;

public class DoubleEqualsToStringBuffer {
public static void main(String args[]) {
		
		StringBuffer s1 = new StringBuffer("Navatha");
		
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("Navatha");
		
		System.out.println(s2);
		
		//== equal operator compares the reference
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
}
	
}



