//Sorting an Array using recursion  //sprting stack also same logic just intead of add,remove use push pop ,peek

import java.util.ArrayList;

public class SortUsingRecursion {
    public static void sort(ArrayList<Integer> v) { 
        if (v.size() <= 1) {
            return; 
        }
        int temp = v.remove(v.size() - 1);
        sort(v);
        insert(v,temp);
    }
    public static void insert(ArrayList<Integer> v,int temp) {
    if(v.size()==0 || v.get(v.size()-1)<=temp) {
    v.add(temp);
    return;
    
        }

        int val= v.remove(v.size() - 1);    //val is created to reduce the space,if not recursion will move on temp continuously
        insert(v,temp);
        v.add(val);

    }

    public static void main (String[]args){
            ArrayList<Integer> v = new ArrayList<>();
            v.add(5);
            v.add(1);
            v.add(3);
            v.add(2);
            v.add(4);

            System.out.println("Before sorting: " + v);
            sort(v);
            System.out.println("After sorting: " + v);
        }
    }



//DeleteMiddleElement

import java.util.ArrayList;

public class DeleteMiddleElement {

    public static void delete(ArrayList<Integer> v) {
        if (v.size()==0) {
            return;
        }
                                                            //here we didnt remove int temp = v.remove(v.size() - 1); as then mid element will chnage its position 
        int mid = v.size() / 2;

        deleteMiddle(v, mid, 0);
    }
    public static void deleteMiddle(ArrayList<Integer> v, int mid, int currentIndex) {

        if (currentIndex == mid) {                          
            v.remove(currentIndex);
            return;
        }

        int temp = v.remove(v.size() - 1);

        deleteMiddle(v, mid, currentIndex + 1);

        v.add(temp);
    }


    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>();
        v.add(5);
        v.add(1);
        v.add(3);
        v.add(2);
        v.add(4);

        System.out.println("Before removing middle element: " + v);
        delete(v); // Remove the middle element using recursion
        System.out.println("After removing middle element: " + v);
    }
}


