// Write a program to count the number of vowels in a string.
import java.util.*;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the string: ");
       String text = sc.nextLine();
        
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        text = text.toLowerCase();

        for (int j = 0; j < text.length(); j++) {
            char ch = text.charAt(j);

            if (ch == 'a') a++;
            else if (ch == 'e') e++;
            else if (ch == 'i') i++;
            else if (ch == 'o') o++;
            else if (ch == 'u') u++;
        }

        System.out.println("a: " + a);
        System.out.println("e: " + e);
        System.out.println("i: " + i);
        System.out.println("o: " + o);
        System.out.println("u: " + u);
    }
}
