//heap is used in priority queue
import java.util.*;

class Main {
    public static void main(String[] args) {
      PriorityQueue<Integer> pq = new PriorityQueue<>();  //minimum value maximum  priority

      // for reversing the priority to highest values eleement use Comparator.reverseOrder()

        pq.add(35);
        pq.add(55);
        pq.add(10);
        pq.add(50);
        pq.add(25);

        System.out.println(pq.peek());
        System.out.println("peek over");
        pq.forEach((x)->System.out.println(x));        //Used as an iterator
        pq.poll();
        System.out.println("poll over");
        pq.forEach((x)->System.out.println(x));
        }
    }


