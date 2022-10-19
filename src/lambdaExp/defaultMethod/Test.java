package lambdaExp.defaultMethod;

public class Test {

	public static void main(String[] args) {

		A a = new A() {
			
		};
		a.display();
		
		A a1 = new B();
		a1.display();
	}
}
