import java.util.*;
public class AddatBottom {
 public static void main(String[] args) {
     Stack<String> s =new Stack<>();
     Stack<String> d =new Stack<>();
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the no. of element ");
     int n = sc.nextInt();
     for (int i=0; i < n; i++){
     System.out.println("enter the element of index:"+i);
      String D = sc.next();
      s.push(D); 
     }
    System.out.println(s);
    d.push("Q");
    for (int i = 0; i < n; i++) {
        String p = s.pop();
        d.push(p);
       System.out.println(d);
    }
 }
}
