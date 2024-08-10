//ArrayList and Iterator 

import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> Al1 = new ArrayList<>();
        ArrayList<Integer> Al2 = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        Al1.add(50);
        Al1.add(0,5);
        Al1.addAll(Al2);
        System.out.println(Al1);
        System.out.println(Al2);
    }
}
