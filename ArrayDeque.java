//ArrayDeque is double ended queue that is we can insert and delete elements from front as well as form back
//it can work both as an stack as well as a queue
import java.util.*;

public class DequeDemo 
{   
    public static void main(String[] args) 
    {
         ArrayDeque<Integer> dq=new ArrayDeque<>();
         
         dq.offerLast(10); //used like a queue
         dq.offerLast(20);
         dq.offerLast(30);
         dq.offerLast(40);
         
         dq.pollFirst();
         
         dq.offerLast(1);
         dq.offerLast(2);
         dq.offerLast(3);
         dq.offerLast(4);
         
         dq.forEach((x)->System.out.println(x));
         
    }    
}
