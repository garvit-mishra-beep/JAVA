import java.util.Scanner;
public class pefixandsufix {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     String s = sc.next();
     String t = sc.next();
     boolean prefix = t.startsWith(s);
     boolean suffix = t.endsWith(s);
     if (prefix && suffix) {
         System.out.println("0");
     } else if (prefix) {
         System.out.println("1");
     } else if (suffix) {
         System.out.println("2");
     } else {
         System.out.println("3");
     }
    }
}
