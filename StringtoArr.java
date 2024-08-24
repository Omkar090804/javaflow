//String to substrings
import java.util.*;

class Solution {
    public static void main(String[] args) {
        String s = "Hello,World";
        String[] strArray = s.split(",");
        System.out.println(Arrays.toString(strArray));
    }
}

// String to char
import java.util.*;

class Solution {
    public static void main(String[] args) {
        String s = "Hello World";
        char[] charArray = s.toCharArray();
        
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'H') {
                System.out.println("True");
            }
        }
        
        System.out.println(Arrays.toString(charArray));
    }
}
