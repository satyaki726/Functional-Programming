package streamExp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping {

	public static void main(String[] args) {

		List<String> s0 = new ArrayList<>();
		s0.add("ARU");
		s0.add("SAT");
		s0.add("RIMPULIMPU");
		
		System.out.println("Unmapped string: "+s0);
		
		List<String> s1 = new ArrayList<>();
		
		for (String string : s0) {
			String string1 = string.toLowerCase();
			s1.add(string1);
		}
		
		System.out.println("Filtered List without Stream: "+s1);
		
		List<String> s2 = s0.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		
		System.out.println("Filtered List with Stream: "+s2);
	}

}
