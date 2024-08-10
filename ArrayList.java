import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> Al1 = new ArrayList<>();
        ArrayList<Integer> Al2 = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        Al1.add(50);
        Al1.addAll(Al2);
        Al1.set(2,100);
        Al1.add(0,5);
        System.out.println(Al1.contains(7));
        System.out.println(Al1.get(3));
        System.out.println(Al1.indexOf(30));
        System.out.println(Al1.isEmpty());
        System.out.println(Al1.clone());
        System.out.println(Al1);
        System.out.println(Al2);

        for (int i=0;i<Al1.size();i++){
            System.out.println(Al1.get(i));
        }
    }
}
