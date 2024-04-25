package org.example;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new NullPointerException("Strings must not be null");
        }

        s1 = s1.toLowerCase().replaceAll("\\s+", "");
        s2 = s2.toLowerCase().replaceAll("\\s+", "");

        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();

        // Increment count for characters in s1
        for (char c : s1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Decrement count for characters in s2
        for (char c : s2.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) - 1);
        }

        // Check if all counts are zero
        for (int count : charCount.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}

