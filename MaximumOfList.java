package JavaPackage;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumOfList {
	
	public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(3,90,350,5);

	Optional<Integer> maxNumber = list.stream()
	      .max((i, j) -> i.compareTo(j));

	System.out.println(maxNumber.get());

}
}
