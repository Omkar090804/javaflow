import java.util.*;

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> Al1 = new LinkedList<>();
        LinkedList<Integer> Al2 = new LinkedList<>(List.of(10, 20, 30, 40, 50));
        Al1.add(50);
        Al1.addAll(Al2);
        Al1.set(2,100);
        Al1.addFirst(69);
        Al1.addLast(69);
        Al1.add(0,5);
        System.out.println(Al1.contains(7));
        System.out.println(Al1.get(3));
        System.out.println(Al1.indexOf(30));
        System.out.println(Al1.isEmpty());
        System.out.println(Al1.clone());
        System.out.println(Al1);
        System.out.println(Al2);
        System.out.println(Al1);

        for (int i=0;i<Al1.size();i++){
            System.out.println(Al1.get(i));
        }
        ListIterator<Integer>it= Al1.listIterator();
        while(it.hasNext()){
            System.out.println("Iterator vala part is : "+ it.next());
        }
    }

}

