/*9. Implement a program that accepts an integer input n and prints Floyd's
Triangle up to n rows. Floyd’s Triangle has consecutive numbers starting
from 1.*/
import java.util.Scanner;
public class Prgm_9_FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
