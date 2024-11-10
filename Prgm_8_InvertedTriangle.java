/*8. Write a program that takes an integer input n and prints an inverted
triangle of numbers*/
import java.util.Scanner;
public class Prgm_8_InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
