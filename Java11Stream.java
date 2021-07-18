import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
public class Java11Stream 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		List<String> al=List.of("rajesh","mca","software");
		al.forEach(System.out::println); // printing list with java11
		List<String> ul=al.stream().map(String::toUpperCase).collect(Collectors.toList());
		ul.forEach(System.out::println);
		//filters accepts predicate 

		Predicate<String> predicateString=p->p.contains("mca");
		List<String> mca=al.stream().filter(predicateString).collect(Collectors.toList());
		System.out.println(mca);

		Map<Integer,String> hosting=new HashMap<Integer,String>();
		hosting.put(1,"aws");
		hosting.put(2,"heroku");
		hosting.put(3,"azure");
		System.out.println("Map operations ");
		Map<Integer,String> filterMap=filterByValue(hosting,x->x.contains("aws"));// check the value of aws in map and get the filtered map with predicate
		System.out.println(filterMap);
		
	
	}
	public static <K,V>Map<K,V> filterByValue(Map<K,V> map,Predicate<V> predicate){
		return map.entrySet().stream().filter(x->predicate.test(x.getValue())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
	}
}
