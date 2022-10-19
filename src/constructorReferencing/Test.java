package constructorReferencing;

public class Test {

	public static void main(String[] args) {

		MyInterface m = s -> new MyClass(s) ;
		m.get("Using Lambda");
		
		MyInterface m1 = MyClass::new;
		m1.get("Using Constructor Referencing");
		
	}

}
