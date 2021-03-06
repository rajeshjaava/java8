import java.util.*;
import java.io.*;
public class OptionalTest 
{

	public static void main(String[] args) 
	{
		String str[]=new String[10];
		Optional<String> isNull=Optional.ofNullable(str[9]);
		if(isNull.isPresent()){
		String str1=str[9].substring(2,5);
		System.out.println("substring "+str1);

		}
		else{
			System.out.println("cannot substring from empty string");
			}
		 str[9]="SubString Optional";
		Optional<String> isValue=Optional.ofNullable(str[9]);
		if(isValue.isPresent()){
		String str2=str[9].substring(2,5);
		System.out.println("substring value is : "+str2);
		}
		else{
			System.out.println("cannot substring from empty string");
			}

		 Optional<String> GOT = Optional.of("Game of Thrones");        
         //Optional.empty() creates an empty Optional object        
         Optional<String> nothing = Optional.empty();
		 GOT.ifPresent(s->System.out.println("Watching GOT"));
		 nothing.ifPresent(s->System.out.println(" nothing "));
		//Optional<Integer> intvalues=Optiona.of(1,2,3,4,5,6,7,8,9);
		 System.out.println(GOT.orElseGet(()->"default value"));
	}
}
