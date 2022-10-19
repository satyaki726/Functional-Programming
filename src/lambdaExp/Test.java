package lambdaExp;

public class Test {

	public static void main(String[] args) {
		
		A a = new C();
		a.mymethod();
		
		A a1 = ()->System.out.println("Finally Lambda");
		a1.mymethod();
		
		int[] x = {1,3,4,5,7,6,10};
		m1(i->i%2==0,x);
	}
	
	static void m1(D<Integer> d,int[] x) {
		for (int i : x) {
			if(d.myMethod(i)) {
				System.out.println(i);
			}
		}
	}

}
