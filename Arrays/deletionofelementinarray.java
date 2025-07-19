import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int deleteIndex = 2; // Delete element at index 2 (value 3)

        // Create new array with one less element
        int[] newArray = new int[original.length - 1];

        for (int i = 0, j = 0; i < original.length; i++) {
            if (i != deleteIndex) {
                newArray[j++] = original[i]; // Copy all except the one to delete
            }
        }

        System.out.println("After deletion: " + Arrays.toString(newArray));
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
