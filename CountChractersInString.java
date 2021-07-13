import java.util.HashMap;
import java.util.Map;

public class CountChractersInString {
	public static void main(String args[]) {
		String s="abcabcab";
		Map<Character,Integer> hmap=new HashMap<Character,Integer>();
		char carray[]=s.toCharArray();
		for(char c:carray) {
			hmap.merge(c, 1,Integer::sum);
		}
		System.out.println(" "+hmap);
		
	}

}