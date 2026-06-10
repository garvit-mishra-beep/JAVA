import java.util.*;
public class MPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> freq = new HashMap<>();
        int maxFreq = 0;
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(c));
        }
        for (char c : s.toCharArray()) {
            if (freq.get(c) != maxFreq) {
                System.out.print(c);
            }
        }
    }
}
