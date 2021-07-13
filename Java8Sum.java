/* array elements sum in java 8*/
import java.io.*;
import java.util.*;
public class Java8Sum
{
public static void main(String args[]){
int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
 for (int i = 0; i < arr.length; i++){
         System.out.print(arr[i]);          
    }
	
System.out.println(" Sum of arrays is "+Arrays.stream(arr).sum());
List<Integer> list=new ArrayList<Integer>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.add(6);
list.stream().forEach(System.out::print);
Integer sum=list.stream().mapToInt(Integer::intValue).sum();
System.out.println("sum with maptoInt is :"+sum);
Integer sum1=list.stream().reduce(0,Integer::sum);
System.out.println("sum1 with reduce is :"+sum1);
Integer sum2=list.stream().map(i->i+2).reduce(0,Integer::sum);
System.out.println("sum2  with map and  reduce is :"+sum2);

}

}