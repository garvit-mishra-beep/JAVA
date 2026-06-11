import java.util.*;
public class Trial {
    public static void main(String[] args) {
       LinkedList<Integer> list = new LinkedList<>();
       list.add(5); 
       list.add(3); 
       list.add(4); 
       list.add(1);
       System.err.println(list.get(1));
       list.set(2, 6);
       System.out.println(list); 
    }
   
    
}