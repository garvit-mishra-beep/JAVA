
import java.util.*;
public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial ");
        int n = sc.nextInt();
        double fact = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + fact);
    }

    public static double calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}