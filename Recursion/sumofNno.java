import java.util.*;
public class sumofNno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        double sum = sumOfNumbers(n);
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
    }

    static double sumOfNumbers(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumOfNumbers(n - 1);
    }
}
