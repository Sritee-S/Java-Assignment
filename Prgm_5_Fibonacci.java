/*5. Write a program that takes an integer input n and stores the first n terms
of the Fibonacci sequence in an array. Then, print the array. For example,
if the user enters 7, store and display the first 7 terms of the Fibonacci
sequence: 0, 1, 1, 2, 3, 5, 8.*/
import java.util.*;
public class Prgm_5_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of fibonacci series : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        int a = 0, b = 1, c;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            arr[i-1] = c;
        }
        System.out.println(Arrays.toString(arr));
    }
}
