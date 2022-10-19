package predicateExp;

import java.util.function.Predicate;

public class Basic {

	public static void main(String[] args) {

		Predicate<Integer> p = i->(i>20);
		System.out.println(p.test(50));
		
		Predicate<String> p1 = s->(s.length()>10);
		System.out.println(p1.test("Satyaki"));
		System.out.println(p1.test("RimpuLimpuKar"));
	}

}
