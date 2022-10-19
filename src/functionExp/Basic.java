package functionExp;

import java.util.function.Function;

public class Basic {

	public static void main(String[] args) {

		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("RimpuLimpu"));
	}

}
