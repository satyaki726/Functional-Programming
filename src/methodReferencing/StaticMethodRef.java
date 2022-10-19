package methodReferencing;

public class StaticMethodRef {

	public static void display() {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Chid Thread");
		}
		
	}

	public static void main(String[] args) {
		
		Runnable r = StaticMethodRef::display;
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
	}

}
