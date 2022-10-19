package lambdaExp.parameters;

public class Test{

	public static void main(String[] args) {
		Addition a = (x,y)->x+y;
		System.out.println(a.add(10, 20));
	}
}
