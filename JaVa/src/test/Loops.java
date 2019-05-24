package test;

public class Loops {
	
	public void forloopdemo() {
		int x =5;
		for(int i=0;i>10;i++) {
			System.out.println(x);
			System.out.println(x +"*" + i +"= "+x*i);
		}
		
		
	}
	
	public static void main(String args[]) {
		Loops l = new Loops();
		l.forloopdemo();
	}

}
