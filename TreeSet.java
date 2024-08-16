import java.util.*;

class Main {
  
  public static void main(String[] args) {
  
    TreeSet<Integer> ts = new TreeSet<>();  

    // can also write  TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));
    
    ts.add(5);
    ts.add(10);
    ts.add(25);
    ts.add(20);
    ts.add(50);
    ts.add(40);
    
    
    ts.add(35);
    ts.pollFirst();
    
    
    System.out.println(ts.ceiling(17));
    System.out.println(ts);
    System.out.println( ts.size());
  }
}
