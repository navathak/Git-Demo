package test;

public  class Mutability {
	
	public final void abd() {
		System.out.println("djgfdhgfhdgfdj");
	}
	
	
	public static void main(String args[]) {
		
		/*String s = new String();
		s= "Navatha";
		System.out.println(s);
		System.out.println(s.concat("BK"));
		
		StringBuffer sb = new StringBuffer("Navatha");
		System.out.println(sb);
		System.out.println(sb.append("Dinesh"));*/
		
		String s1 = new String("Durga");
		s1.concat("Software");
		String s2 = new String("Solutions");
		s1= s1.concat("Soft");
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
	
	
}
