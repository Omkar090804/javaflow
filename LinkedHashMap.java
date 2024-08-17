//similar to HashMap just this has a prev and a next ptr as linked list
//Follows the order in which the elements are inserted
//Size of the linkedhashmap can be made fixed

import java.util.*;

public class LinkedHashMap
{
    public static void main(String[] args) 
    {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5)   //5 is the size if we want the eleemnts to be displayed acc to the least receentely used elemnts then
          //(5,loading factor,true)
        { 
            
            protected boolean removeEldestEntry(Map.Entry e)           //to keep size of linkedhashmap fixed to 5;
            {                                                      
                return size()>5;
            }
        };
        
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
        String s=lhm.get(2);
        s=lhm.get(5);
        s=lhm.get(1);
        lhm.put(6,"F");
        
        lhm.forEach((k,v)->System.out.println(k+" "+v));  //printing all values
        
    }   
}
