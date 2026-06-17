import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        Set<Character> v = new HashSet<>();
        for (char c : "AEIOUYaeiouy".toCharArray()) {
            v.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : i.toCharArray()) {
            if (!v.contains(c)) {
                result.append(".").append(Character.toLowerCase(c));
            }
        }
        System.out.println(result.toString());
        sc.close();
    }
}
