import java.util.HashMap;

class Solution {
    // Memoization map to store results of subproblems
    static HashMap<String, Boolean> memo = new HashMap<>();

    static boolean isScramble(String S1, String S2) {
        // Create a unique key for the current pair of strings
        String key = S1 + " " + S2;

        // If we have already solved this pair, return the stored result
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // If the strings are equal, they are trivially scrambled versions
        if (S1.equals(S2)) {
            memo.put(key, true);
            return true;
        }

        // If length is <= 1 and strings are not equal, can't be scrambled
        if (S1.length() <= 1) {
            memo.put(key, false);
            return false;
        }

        int n = S1.length();
        boolean flag = false;

        // Try all possible split positions
        for (int i = 1; i <= n - 1; i++) {
            // Case 1: Swap the two parts
            boolean cond1 = isScramble(S1.substring(0, i), S2.substring(n - i, n)) &&
                            isScramble(S1.substring(i, n), S2.substring(0, n - i));

            // Case 2: Don't swap the two parts
            boolean cond2 = isScramble(S1.substring(0, i), S2.substring(0, i)) &&
                            isScramble(S1.substring(i, n ), S2.substring(i , n));

            // If any case is true, strings are scramble of each other
            if (cond1 || cond2) {
                flag = true;
                break;
            }
        }

        // Store the result in the map for future reference
        memo.put(key, flag);
        return flag;
    }
}
