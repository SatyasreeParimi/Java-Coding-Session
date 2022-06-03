package JavaPackage;

import java.util.*;
import java.util.stream.*;

public class FindingDuplicates {
	
	public static Set<Integer> duplicate(Stream<Integer> Stream1) {
		
		 Set<Integer> items = new HashSet<>();
		  
	            return Stream1
	  
	            .filter(n -> !items.add(n))
	  
	            .collect(Collectors.toSet());
		
		
	}
	
	public static void main(String[] args) {
		
		Stream <Integer> Stream1 = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		
		System.out.println(duplicate(Stream1));
		
		
		
	}

}
