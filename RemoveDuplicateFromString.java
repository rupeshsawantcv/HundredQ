//Remove duplicates from string — print only unique chars.r.
import java.util.*;
class RemoveDuplicateFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        
        System.out.println("Original String: "+str);
        System.out.println("After removing duplicates(using normal method): "+removeDuplicate(str));
         System.out.println("After removing duplicates(using collections): "+RemoveUsingCollections(str));
        
      }
      public static String removeDuplicate(String str){
          String unq = "";
          for(int i = 0; i<str.length();i++){
              char ch = str.charAt(i);
              if(unq.indexOf(ch)==-1){
                  unq+=ch;
              }
          }
          
          
          return unq.toString();
      }
      
      public static String RemoveUsingCollections(String str){
          Set<Character> set = new LinkedHashSet<>();
          for(char ch : str.toCharArray()){
              set.add(ch);
          }
          
          StringBuffer sb = new StringBuffer();
          for(char ch : set){
              sb.append(ch);
          }
          return sb.toString();
      }
        
        
}
