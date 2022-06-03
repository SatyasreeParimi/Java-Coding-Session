package JavaPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
	
    ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(4,5,7,8,99,100,101,33,32,4,4));
     
    System.out.println("ArrayList with duplicates :" + numbersList);

    List<Integer> listWithoutDuplicates = numbersList.stream().distinct().collect(Collectors.toList());
     
    System.out.println("ArrayList without duplicates:" +listWithoutDuplicates);
    
	}

}




 

  