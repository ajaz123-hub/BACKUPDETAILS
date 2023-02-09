package java8;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//largest number in array
		int a[]= {4,6,2,48,9,456,786,123,43,28};
		
	
		
		List<Integer> arr=Arrays.asList(4,6,2,48,9,456,786,123,43,28);
		
		Optional<Integer> res=arr.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		
		Integer integer = arr.stream().max(Integer::compare).get();
		System.out.println(integer);
		
		System.out.println(res.get());
		
		
		
		Integer integer2 = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).limit(2).findFirst().get();
		
		Integer integer3 = Arrays.stream(a).boxed().sorted(Comparator.naturalOrder()).skip(1).limit(2).findFirst().get();
		System.out.println(integer2);
		
		System.out.println(integer3);
		

		OptionalDouble integer4 = Arrays.stream(a).boxed().mapToInt(num-> num).average();
		System.out.println(integer4.getAsDouble());
		
		IntSummaryStatistics summaryStatistics = Arrays.stream(a).boxed().mapToInt(num-> num).summaryStatistics();
		
		
		
		
		List<String> names = Arrays.asList(
                "Bond",
                "Einstein",
                "Alice",
                "Whitman",
                "Bob",
                "Spider"
                );
 
		
		String string = names.stream().max(Comparator.comparingInt(String::length)).get();
	
		System.out.println(string);
		
		
		String string2 = names.stream().collect(Collectors.maxBy(Comparator.comparingInt(String::length))).get();
		
		System.out.println(string2);
		
		 List<Integer> collect = names.stream().map(String::length).collect(Collectors.toList());
		 
		 System.out.println(collect);
		 
		 Integer integer5 = names.stream().map(String::length).max(Integer::compare).get();
		 
		 System.out.println(integer5);
		String s[]= {
                "Bond",
                "Einstein",
                "Alice",
                "Whitman",
                "Bob",
                "Spider"
		};
		
		Optional<String> max = Arrays.stream(s).max(Comparator.comparing(String::length));
		System.out.println(max.get());
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		

	}

}
