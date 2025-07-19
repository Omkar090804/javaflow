import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] original = {1, 2, 4, 5};  // Original array
        int insertIndex = 2;            // Index to insert at
        int newValue = 3;               // Value to insert

        // Create new array with one extra slot
        int[] newArray = new int[original.length + 1];

        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == insertIndex) {
                newArray[i] = newValue; // Insert new value
            } else {
                newArray[i] = original[j++]; // Copy original elements
            }
        }

        System.out.println("After insertion: " + Arrays.toString(newArray));
    }
}


//or 

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int deleteIndex = 2; // Remove element at index 2 (value 3)
        list.remove(deleteIndex);

        System.out.println("After deletion: " + list);
    }
}

