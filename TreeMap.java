//Tree map takes log(n) time for basic operations
//gives elements in sorted manner

import java.util.*;
import java.util.Map.*;

public class MapDemo 
{ 
    public static void main(String[] args) 
    {    
        TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D")); 
      //elememnts given as the data type is given
      //0 is key A is value ...
        

        tm.put(4,"E");
        tm.put(5,"F");
        
        
        Entry<Integer,String> e=tm.firstEntry();   //creating an own entry
        
        System.out.println(e.getKey()+" "+e.getValue()); 
        
        System.out.println(tm);
        
    }  
}
