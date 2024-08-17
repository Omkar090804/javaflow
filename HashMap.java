//it takes O(1) time complexity to solve basic operations
//It does not give elememnts in sorted form
//Loading factor plays role

import java.util.*;
import java.util.Map.*;

public class MapDemo 
{ 
    public static void main(String[] args) 
    {    
        HashMap<Integer,String> tm=new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
      
      //key ,value pairs are present
    

        tm.put(4, "E");
        tm.put(5, "F");

        System.out.println(tm.containsKey(7));
        System.out.println(tm.get(3));
        System.out.println(tm);
        tm.remove(3);

        System.out.println(tm.size());


        System.out.println(tm);
    }
}

        
  
