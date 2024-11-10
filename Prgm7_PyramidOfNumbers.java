/*7. Write a program that takes an integer input n and prints a pyramid of
numbers up to n rows, where each row has an increasing count of
numbers.*/
import java.util.Scanner;
public class Prgm7_PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
