//1. Write a Java program that takes an integer input from the user and
//calculates the factorial of the number. Then, write a method to calculate
//the sum of the digits of this factorial. For example, if the user enters 5,
//calculate 5! (120) and then find the sum of its digits (1 + 2 + 0 = 3).
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (between 1 to 19) : ");
        int n = sc.nextInt();
        int fact = 1 , temp = n;
        if(n < 20) {
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("The factorial of "  + temp + " is : " + fact);
            int num = sumOfDigits(fact);
            System.out.println("The sum of digits of " + fact + " is : " + num);
        }
        else{
            System.out.println("Number out of range");
        }
    }
    static int sumOfDigits(int fact) {
        int rem, sum = 0;
        while (fact != 0){
            rem = fact % 10;
            sum += rem;
            fact = fact / 10;
        }
        return sum;
    }
}

