import java.io.*;
import java.util.stream.Collectors;
import java.util.*;
public class EvenStream 
{
	public static void main(String[] args) 
	{
		System.out.println("Finding Evens in Stream !");
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		 List<Integer> evenList=myList.stream().filter(a->a%2==0).collect(Collectors.toList());
		 evenList.forEach(System.out::println);
		 //Finding the number starting with one
		 System.out.println("Numbers starting with 1 !");
		 myList.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
		// Finding duplicates in the list
		List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,32,10,15,8,49);
		Set<Integer> setValues=new HashSet<>();
		System.out.println("Finding duplicate numbers !");
		myList1.stream().filter(s->!setValues.add(s)).forEach(System.out::println);
		System.out.println("Finding first  number !");
		myList.stream().findFirst().ifPresent(System.out::println);
	}
}
