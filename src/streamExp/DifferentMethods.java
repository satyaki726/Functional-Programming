package streamExp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DifferentMethods {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			l1.add(i);
		}
		
		long count = l1.stream().filter(i->i%2==0).count();
		System.out.println(count);
		
		Comparator<Integer> comp = (i1,i2)->i2.compareTo(i1);
		
		List<Integer> l2 = l1.stream().sorted(comp).collect(Collectors.toList());
		System.out.println(l2);
		
		Integer max = l1.stream().filter(i->i%2==0).max(comp).get();
		System.out.println(max);
		
		Integer min = l1.stream().min(comp).get();
		System.out.println(min);
		
		l1.forEach(i->System.out.println(i));
		
	}

}
