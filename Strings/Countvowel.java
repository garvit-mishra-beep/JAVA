import java.util.*;
public class Countvowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next().toLowerCase();
        int count = 0;
        int coun = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
            else {
                coun++;
            }
        }
        System.out.println("Number of vowels: " + count);
        System.out.println("Number of consonants: " + coun);
        
    }
}
