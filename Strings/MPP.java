import java.util.*;
public class MPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[26];
        int maxFreq = 0;
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
            maxFreq = Math.max(maxFreq, freq[c - 'a']);
        }
        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] != maxFreq) {
                System.out.print(c);
            }
        }
    }
}
