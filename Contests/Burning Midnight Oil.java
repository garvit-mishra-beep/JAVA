import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long left = 1;
        long right = n;
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (sumOfSeries(mid, k) >= n) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }
    private static long sumOfSeries(long v, int k) {
        if (v == 0) {
            return 0;
        }
        return v + sumOfSeries(v / k, k);
    }
}
