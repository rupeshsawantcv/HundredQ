//Reverse a string — preserve character order.
import java.util.*;
class ReverseStringTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Original String: "+str);
         System.out.println("Reverse String(using normal method): "+rev(str));
         System.out.println("Reverse String(using StringBuilder): "+revSb(str));
        
    }
    public static String rev(String str){
         String original = str;
         
        String rev="";
        for(int i = str.length()-1; i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
        
        }
        public static StringBuilder revSb(String str){
         String original = str;
         
         StringBuilder sb = new StringBuilder();
         
        
        for(int i = str.length()-1; i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb;
        
        }
        
        
}
