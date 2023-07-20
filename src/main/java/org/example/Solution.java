package org.example;

public class Solution {

    /**
     * Constructs a new string using the given string and an integer array that contains indices of characters in the new string.
     *
     * @param s The input string.
     * @param indices An integer array containing the indices at which characters from the input string will be placed in the new string.
     * @return The newly constructed string.
     */
    public String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];

        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }

        return String.valueOf(result);
    }
}
