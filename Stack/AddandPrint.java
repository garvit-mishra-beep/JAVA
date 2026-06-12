import java.util.*;
public class AddandPrint {
   public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    System.out.println(s.peek());
    System.out.println("Stack after pushing 4 elements:");
    System.out.println(s);   
    System.out.println("removing:"+s.pop());
    System.out.println(s);   
    System.out.println("removing:"+s.pop());
    System.out.println(s);
    System.out.println("removing:"+s.pop());
    System.out.println(s);
}
}