import java.util.*;
public class CountFrequency 
{
	public static void main(String[] args) 
	{
		String s="abcabcabcab";
		Map<Character,Integer> freqsMap=new HashMap<>();
		for(char c:s.toCharArray()){
/* Map.merge(key, value, BiFunction) is doing the tedious update of the Map if a char exists there or not.

The above code prints:
*/
		freqsMap.merge(c,1,Integer::sum);
		}
		System.out.println("Frequencies :\n "+freqsMap);
	}
}
