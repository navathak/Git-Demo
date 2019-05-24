package test;

public class B extends A {
	public void methodOfB() {
		System.out.println("This is from child class B of method b");
	}

	public static void main(String[] args) {
		A a = new B();
		a.methodOfA();
		B b = new B();
		b.methodOfA();
		b.methodOfB();
	}
}
