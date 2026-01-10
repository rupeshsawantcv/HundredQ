//Check if a string is an anagram of another.
import java.util.*;
class CheckStringAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();
        
       if(checkAnagram(str1 , str2)){
           System.out.println(str1+" and "+str2+" is Anagram");
       }else{
           System.out.println(str1+" and "+str2+" is not Anagram");
       }
        
      }
      public static Boolean checkAnagram(String str1, String str2){
          if(str1.length()!=str2.length()) return false;
          
          char[] s1 = str1.toCharArray();
          char[] s2 = str2.toCharArray();
          Arrays.sort(s1);
          Arrays.sort(s2);
         
          return Arrays.equals(s1,s2);
      }
     
        
        
}
