//Hashing technique
// open addressing and chaining two types of hashing techniques

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

      //setting loading factor
        HashSet<Integer> hs=new HashSet<>(20,0.75f);  
        
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        
        System.out.println(hs);  
    }
    
}
