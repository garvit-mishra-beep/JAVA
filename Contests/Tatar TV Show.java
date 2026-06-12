import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            boolean ok = true;
            for (int start = 0; start < k; start++) {
                int count = 0;
                for (int i = start; i < n; i += k) {
                    if (s.charAt(i) == '1') {
                        count++;
                    }
                }
                if (count % 2 != 0) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}