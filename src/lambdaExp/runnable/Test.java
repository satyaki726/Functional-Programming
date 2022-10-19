package lambdaExp.runnable;

public class Test {

	public static void main(String[] args) {

		Runnable r = new MyThread();
		Thread t = new Thread(r);
		t.start();
		
		Runnable r1 = ()->{
			for(int i=0;i<5;i++) {
				System.out.println("Child Thread2");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Child Thread3");
				}
			}
			
		});
		t2.start();
		
		Thread t3 = new Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("Child Thread4");
			}
		});
		t3.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
	}

}
