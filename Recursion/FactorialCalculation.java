
import java.util.*;
public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial ");
        int n = sc.nextInt();
        double fact = calculateFactorial(n);
        double factIterative = 1;
        for(int i=1; i<=n; i++) {
            factIterative *= i;
        }
        System.out.println("Factorial by recursion of " + n + " is: " + fact);
        System.out.println("Factorial* by loop of " + n + " is: " + factIterative);
    }
    public static double calculateFactorial(int n) {
        return n * calculateFactorial(n-1);
    }
}