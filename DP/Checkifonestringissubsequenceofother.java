/*
Given two strings A and B, find if A is a subsequence of B.

Example 1:

Input:
A = AXY 
B = YADXCP
Output: 0 
*/

class Solution {
    boolean isSubSequence(String A, String B) {
        int i = 0; // pointer for A
        int j = 0; // pointer for B

        while (i < A.length() && j < B.length()) {
            if (A.charAt(i) == B.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == A.length();  // if all characters of A are found in B in order
    }
}
