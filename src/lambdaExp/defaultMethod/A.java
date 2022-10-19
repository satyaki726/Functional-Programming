package lambdaExp.defaultMethod;

public interface A {

	default void display() {
		System.out.println("Inside display method of A");
	}
}
