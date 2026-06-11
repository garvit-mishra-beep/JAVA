import java.util.*;
public class PrintNno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printNumbers(n);      // n to 1
        PrintNno(1, n);       // 1 to n
    }
    static void PrintNno(int n, int m) {
        if (n > m) {
            System.out.println("The END");
            return;
        }
        System.out.println(n);
        PrintNno(n + 1, m);
    }
    static void printNumbers(int n) {
        if (n <= 0) {
            System.out.println("The END");
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }
}