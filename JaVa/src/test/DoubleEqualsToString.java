package test;

public class DoubleEqualsToString extends Mutability {

	
	
	public  void xyz() {
		abd();
	}
	
	
public static void main(String args[]) {
	DoubleEqualsToString c = new DoubleEqualsToString();
	c.xyz();
	
		/*
		String s1 = new String("Navatha");
		//s1= "Navatha";
		System.out.println(s1);
		
		String s2 = new String("Navatha");
		//s2= "Navatha";
		System.out.println(s2);
		
		//== equal operator compares the reference
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		*/
	/*String s1 = new String();
	s1= "Navatha";
	System.out.println(s1);
	
	String s2 = new String();
	s2= "Navatha";
	System.out.println(s2);
	
	//== equal operator compares the reference and .equals method compares the contents
	
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));*/
		String s1 = new String("Atul");
		s1= "Atul";
		System.out.println(s1);

		String s2 = new String("Atul");
		s2= "atul";
		System.out.println(s2);

		//== equal operator compares the reference and .equals method compares the contents

		System.out.println(s1==s2);
		System.out.println(s1.equalsIgnoreCase(s2));
}
	
}
