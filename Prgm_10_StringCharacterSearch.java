/*10. Take a string input from the user and a character to search for. Write a
method to count the occurrences of the character in the string and return
the count. Then display the count to the user.*/
import java.util.*;
public class Prgm_10_StringCharacterSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.print("Enter the character to search : ");
        char ch = sc.next().charAt(0);
        int result = occurences(str, ch);
        System.out.println("The number of occurrence of character '"+ ch +"' in string '" + str +"' is : " + result);
    }

    static int occurences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}
