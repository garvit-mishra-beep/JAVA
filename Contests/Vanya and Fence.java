import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int width = 0;
        for (int i = 0; i < n; i++) {
            int ai = scanner.nextInt();
            if (ai > h) {
                width += 2;
            } else {
                width++;
            }
        }
        System.out.println(width);
        scanner.close();
    }
}
