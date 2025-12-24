

// Write a program to count the number of consonants in a string.

import java.util.*;
public class ConsonantCount {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the string: ");
       String text = sc.nextLine();
        int count = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {   // check alphabet
                if (ch != 'a' && ch != 'e' && ch != 'i' &&
                    ch != 'o' && ch != 'u') {
                    count++;
                }
            }
        }

        System.out.println("Number of consonants: " + count);
    }
}
