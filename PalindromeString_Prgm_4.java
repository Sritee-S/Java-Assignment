/*4. Accept a string input from the user and check if it’s a palindrome (a word
that reads the same forwards and backwards). Create a method to
reverse the string and compare it to the original to determine if it’s a
palindrome.*/
import java.util.*;
public class PalindromeString_Prgm_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any word : ");
        String word = sc.next();
        boolean result = palindrome(word);
        if(result){
            System.out.println(word + " is a palindrome word");
        }
        else{
            System.out.println(word + " is not a palindrome word");
        }
    }

    static boolean palindrome(String word) {
        String rev = "";
        boolean res = false;
        for (int i = word.length() - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);
        }
        if(word.equals(rev)){
            res = true;
        }
        return res;
    }
}
