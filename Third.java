import java.util.*;
import java.util.*;
class Third
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner (System.in);
     int size=sc.nextInt();
     String[]arrray=new String[size];
     for(int i=0;i<size;i++)
       arrray[i]=sc.next();
     TreeMap<Integer,ArrayList<String>>hash=new TreeMap<>();
     for(int i=0;i<size;i++)
     {
       String a=arrray[i];
       int len=a.length();
       if(hash.containsKey(len)){
       ArrayList<String> temp=hash.get(len);
       temp.add(a);

     }
     else{
       ArrayList<String>temp=new ArrayList<>();
       temp.add(a);
       hash.put(len,temp);
     }

     }
     int f=0;
  
     for(Map.Entry element:hash.entrySet())
     {
       int key=(int)element.getKey();
       ArrayList<String> temp=hash.get(key);
     //  g=f;
       f=f+temp.size();
       if((size-f)<3)
       {
         System.out.print(temp.get(temp.size()-1));
         break;
       }

     }
   }

}