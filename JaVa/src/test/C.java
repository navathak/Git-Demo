package test;

public class C extends B{
	public void methodOfC() {
		System.out.println("This is method of class C");
	}
	public static void main(String[] args) {
		A ca = new C();
		ca.methodOfA();
		B cb = new C();
		cb.methodOfA();
		cb.methodOfB();
		C cc = new C();
		cc.methodOfA();
	}

}
