/*3. Build a menu-driven calculator that performs addition, subtraction,
multiplication, or division based on the user's choice. Use if-else
statements to determine the operation.
Keep prompting the user to perform another operation until they choose
to exit.*/
import java.util.Scanner;
public class Calculator_Prgm_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean istrue = true;
        while (istrue){
            System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Exit");
            System.out.print("Choose an Operation to be performed : ");
            int ch = sc.nextInt();
            if (ch == 5){
                istrue = false;
                System.out.println("Exit!!");
                break;
            }
            System.out.print("Enter the first number : ");
            int n1 = sc.nextInt();
            System.out.print("Enter the second number : ");
            int n2 = sc.nextInt();
            if (ch == 1){
                System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
            }
            else if (ch == 2) {
                System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
            }
            else if (ch == 3){
                System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
            }
            else if (ch == 4){
                if(n2 == 0){
                    System.out.println("Error : Division by zero");
                }
                else {
                    System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
                }
            }
            else{
                System.out.println("Invalid choice!!");
            }
        }
    }
}
