//Write a program to check if two strings are anagrams

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        // Convert to lowercase and remove spaces
        s1 = s1.toLowerCase().replaceAll("\\s", "");
        s2 = s2.toLowerCase().replaceAll("\\s", "");

        // Check length first
        if (s1.length() != s2.length()) {
            System.out.println("Not anagrams");
            return;
        }

        // Convert to char arrays
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        // Sort arrays
        Arrays.sort(a1);
        Arrays.sort(a2);

        // Compare arrays
        if (Arrays.equals(a1, a2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not anagrams");
        }
    }
}
