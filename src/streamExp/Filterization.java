package streamExp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filterization {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>(); 
		
		for(int i=0;i<5;i++) {
			l1.add(i);
		}
		
		System.out.println("Unfiltered List: "+l1);
		
		List<Integer> l2 = new ArrayList<>();
		
		for (Integer integer : l1) {
			if(integer%2==0) {
				l2.add(integer);
			}
		}
		
		System.out.println("Filtered List without Stream: "+l2);
		
		List<Integer> l3 = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println("Filtered List with Stream: "+l3);
		
	}

}
