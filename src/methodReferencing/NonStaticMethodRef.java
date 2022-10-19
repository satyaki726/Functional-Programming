package methodReferencing;

public class NonStaticMethodRef {

	public void myMethod(int x) {
		System.out.println(x);
	}
	
	public static void main(String[] args) {

		MyInterface m = x->System.out.println(x);
		m.display(10);
		
		NonStaticMethodRef n = new NonStaticMethodRef();
		MyInterface i  = n::myMethod;
		i.display(20);
		
	}

}
