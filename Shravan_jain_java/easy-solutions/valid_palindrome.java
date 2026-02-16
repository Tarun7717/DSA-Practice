import java.util.*;
public class valid_palindrome {

    public static void main(String[] args) {
        String var="Was it a car or a cat I saw";
    //    StringBuilder sb= new StringBuilder(var);
    //     StringBuilder rev=sb.reverse();
    //     System.out.println(rev);
    //      String check=sb.toString().toLowerCase();
    //      if(check==var){
    //         System.out.println("palindrome");
    //      }
    //     if(sb.toString().toLowerCase().equals(rev)){
    //         System.out.println("palindrome");
    //     }
    //     else
    //     {
    //         System.out.println("not palindrome");
    //     }
    String clean = var.replaceAll("[? ]", "");
    System.out.println(clean);
    StringBuilder sb = new StringBuilder(clean);
    String low=sb.toString().toLowerCase();
    System.out.println(low);
    StringBuilder n=new StringBuilder(low);
    StringBuilder rev=n.reverse();
    if(rev.equals(n))
        System.out.println("palindrome");
    else{
        System.out.println("not palindrome");
        System.out.println(rev);
    }
    }
   
}
// ya you know so many trial and error here is the most optimized minimal code
// class Solution {
//     public boolean isPalindrome(String s) {
        
//         String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
//         String rev = new StringBuilder(clean).reverse().toString();
        
//         return clean.equals(rev);
//     }
// }

// this is what i added in my solution after learnign how to optimize it 