package JavaPackage;

import java.util.Comparator;
import java.util.stream.Stream;

public class MinAndMaxOfList {
	
	public static void main(String[] args) {
	
	Integer maxNumber = Stream.of(6, 8, 3, 5, 1, 9)
	          .max(Comparator.comparing(Integer::valueOf))
	          .get();
	 
	Integer minNumber = Stream.of(6, 8, 3, 5, 1, 9)
	          .min(Comparator.comparing(Integer::valueOf))
	          .get();
	
	System.out.println(maxNumber);
	System.out.println(minNumber);

}
}
