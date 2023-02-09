package java8;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class JavaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> companies = new ArrayList<String>();
		 
		 
        // 1.1 add string elements to List
        companies.add("Meta");
        companies.add("Apple");
        companies.add("Amazon");
        companies.add("Netflix");
        companies.add("Meta"); // duplicate
        companies.add("Google");
        companies.add("Apple"); 
        companies.add("Meta"); /// duplicate
        
        List<String> distinct = companies.stream().distinct().collect(Collectors.toList());
        //System.out.println("the:" +distinct);
        for(String company:distinct)
        {
        	companies.remove(company);
        }
        
        Map<String, Long> collect = companies.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(collect);
        
        System.out.println(collect.size());
        
        ///
        
        /*frequency of arralist*/
        
        List<String> freq = new ArrayList<String>();
        
        freq.add("Meta");
        freq.add("Apple");
        freq.add("Amazon");
        freq.add("Netflix");
        freq.add("Meta"); // duplicate
        freq.add("Google");
        freq.add("Apple"); 
        freq.add("meta");
        
       Map<String, Long> collect2 = freq.stream().collect(Collectors.groupingBy(i -> i,Collectors.counting()));
       Stream<Entry<String, Long>> sorted = collect2.entrySet().stream().sorted();
       sorted.forEach(System.out::println);
	}

}
